import React, { Component } from 'react';

import api from '../services/api';

import { View, Text, FlatList, TouchableOpacity, StyleSheet, Button, Alert } from 'react-native';

export default class Balances extends Component {
    static navigationOptions = {
        title: "Créditos"
    };

    state = {
        docs: [],
        type: "",
        value: "",
    }

    componentDidMount() {
        this.loadFinances();
    }

    loadFinances = async () => {
        const response = await api.get('/finances/balances');

        const docs = response.data;

        this.setState({ docs });

    };


    renderItem = ({ item }) => {

        if (item.type == "balances") {
            this.value = `${item.value}`
        } else if (item.type == "debts") {
            this.value = `-${item.value}`
        }

        return (
            <View style={styles.finaceContainer}>
                <Text style={styles.title}>{item.title}</Text>
                <Text style={styles.value}>R$ {this.value},00</Text>

                <View style={styles.containerOptionsFinance}>
                    <TouchableOpacity style={styles.financeButton1} onPress={() => {
                        this.props.navigation.navigate("updateFinance", { finance: item });
                    }}>
                        <Text style={styles.financeButtonText}>Editar</Text>
                    </TouchableOpacity>


                    <TouchableOpacity style={styles.financeButton} onPress={() => {
                        Alert.alert(
                            'Apagar',
                            `Deseja realmente apagar ${item.title} de sua lista de finanças?`,
                            [
                                {
                                    text: "Sim", onPress: async () => {
                                        await api.delete(`/finances/${item._id}`)
                                            .then(res => {
                                                Alert.alert(
                                                    'Sucesso',
                                                    'O item foi excluído com sucesso'
                                                )
                                            })
                                            .catch(err => {
                                                Alert.alert(
                                                    'Erro',
                                                    'O item não pode ser excluído'
                                                )
                                            })
                                    }
                                },
                                {
                                    text: "Não", onPress: () => {

                                    }
                                }
                            ],
                            { cancelable: true }
                        );
                    }}>
                        <Text style={styles.financeButtonText}>Excluir</Text>
                    </TouchableOpacity>
                </View>
            </View>
        )
    }

    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.messageTop}>Sua Trilha de Finanças:</Text>
                <FlatList
                    data={this.state.docs}
                    keyExtractor={item => item._id}
                    renderItem={this.renderItem}
                    contentContainerStyle={styles.list}
                    extraData={this.state} />

            </View>
        );
    }
}



const styles = StyleSheet.create({

    messageTop: {
        textAlign: "center",
        fontSize: 18,
        fontWeight: "bold",
        marginBottom: 5,
        marginTop: 15,
        color: "#1D3C34"
    },

    container: {
        flex: 1,
        backgroundColor: "#FAFAFA"
    },

    list: {
        padding: 20
    },

    finaceContainer: {
        backgroundColor: "#f2f2f2",
        borderWidth: 1.5,
        borderColor: '#8bc197',
        borderRadius: 5,
        padding: 15,
        marginBottom: 20
    },

    type: {
        textAlign: "center",
        fontSize: 14,
        color: "#bab8b8"
    },

    title: {
        textAlign: "left",
        fontSize: 24,
        fontWeight: "bold",
        color: "#005844"
    },

    value: {
        textAlign: "right",
        fontSize: 20,
        color: "#183028"
    },

    containerOptionsFinance: {
        display: 'flex',
        marginTop: 10,
        paddingLeft: 7.5,
        paddingRight: 7.5,
        flexDirection: 'row'
    },

    financeButton1: {
        flex: 1.75,
        backgroundColor: "#76bc8a",
        borderWidth: 1.5,
        borderColor: "#374c3a",
        height: 30,
        borderRadius: 5,
        marginRight: 75,
        justifyContent: "center",
    },

    financeButton: {
        flex: 1.25,
        backgroundColor: "#e2515b",
        borderWidth: 1.5,
        borderColor: "#374c3a",
        height: 30,
        borderRadius: 5,
        justifyContent: "center",
    },

    financeButtonText: {
        fontSize: 14,
        textAlign: "center",
        color: "#183028"
    }
});