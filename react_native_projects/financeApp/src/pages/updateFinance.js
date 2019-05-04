import React, { Component } from 'react';

import { StyleSheet, Text, View, Picker, TextInput, TouchableOpacity, Alert } from 'react-native';

import api from '../services/api';

export default class UpdateFinance extends Component {
    static navigationOptions = {
        title: "Alterar Finança"
    };

    constructor(props) {
        super(props);
        this.routeParams = props.navigation.state.params;
        this.state = {
            _id : this.routeParams.finance._id,
            type: this.routeParams.finance.type,
            title: this.routeParams.finance.title,
            value: (this.routeParams.finance.value).toString(),
        };
    }


    render() {

        return (
            <View style={styles.newFinanceContainer}>
                <View style={styles.containerInput}>
                    <Text style={styles.descriptionInput}>Tipo:</Text>
                    <Picker
                        style={styles.selectInput}
                        selectedValue={this.state.type}
                        onValueChange={(itemValue, itemIndex) =>
                            this.setState({ type: itemValue })
                        }>
                        <Picker.Item label="Crédito" value="balances" />
                        <Picker.Item label="Débito" value="debts" />
                    </Picker>
                </View>
                <View style={styles.containerInput}>
                    <Text style={styles.descriptionInput}>Título:</Text>
                    <TextInput
                        style={styles.input}
                        onChangeText={(title) => this.setState({ title })}
                        value={this.state.title}
                    />
                </View>
                <View style={styles.containerInput}>
                    <Text style={styles.descriptionInput}>Valor R$:</Text>
                    <TextInput
                        style={styles.input}
                        keyboardType={'numeric'}
                        onChangeText={(value) => this.setState({ value })}
                        value={this.state.value}
                    />
                </View>
                <TouchableOpacity
                    style={styles.buttonCreate}
                    onPress={ async () => {
                        await api.put(`/finances/${this.state._id}`, {
                            type: this.state.type,
                            title: this.state.title,
                            value: Number(this.state.value)
                        })
                        .then(res => {
                            
                            Alert.alert(
                                'Sucesso',
                                'O item foi alterado com sucesso'
                            )
                        })
                        .catch(err => {
                            Alert.alert(
                                'Erro',
                                'O item não pode ser alterado'
                            )
                        })
                        this.props.navigation.navigate("Home");
                    }}>
                    <Text style={styles.buttonCreateText}>Cadastrar</Text>
                </TouchableOpacity>
            </View>
        );
    }
}

const styles = StyleSheet.create({

    newFinanceContainer: {
        flex: 1,
        backgroundColor: "#FAFAFA",
        paddingTop: 20,
        paddingLeft: 10,
        paddingRight: 10,
        alignItems: 'center',
    },

    titlePage: {
        textAlign: 'center',
        fontSize: 20,
        fontWeight: 'bold',
        marginBottom: 40,
    },

    containerInput: {
        flexDirection: 'row',
        height: 35,
        justifyContent: 'center',
        marginBottom: 30,
    },

    descriptionInput: {
        flex: 1,
        textAlign: 'left',
        paddingTop: 10,
        fontSize: 18
    },

    selectInput: {
        flex: 1.5,
    },

    input: {
        flex: 1.5,
        borderWidth: 0.5,
        borderColor: '#8bc197',
    },

    buttonCreate: {
        width: 125,
        height: 40,
        borderWidth: 0.75,
        borderColor: '#13322B',
        backgroundColor: "#76bc8a",
        alignItems: 'center',
        justifyContent: 'center',
        marginTop: 30,
        borderRadius: 5,
    }
})