import React, { Component } from 'react';
import { View, Text, FlatList, Button, StyleSheet } from 'react-native';

import api from '../services/api';

export default class Home extends Component {

	static navigationOptions = {
		title: 'Fincances'
	};

	state = {
		FinanceInfo: {},
		docs: []
	};

	componentDidMount() {
		this.loadFinances();
	}

	loadFinances = async () => {
		try {
			const response = await api.get(`/finances`);

			const { docs, ...FinanceInfo } = response.data;

			this.setState(
				{
					docs: [...this.state.docs, ...docs],
					FinanceInfo
				});
		} catch (error) {
			console.log(error);
		}
	};

	renderItem = ({ item }) => {
		return (
			<View style={styles.productContainer}>
				<Text style={styles.productTitle}>{item.type}</Text>
				<Text style={styles.productDescription}>{item.title}</Text>
				{/* <Text style={styles.productDescription}>{item.value}</Text> */}
			</View>
		);
	};

	// Retorna o que será visualizado
	render() {
		return (
			<View style={styles.container}>
				<Text>Home Page</Text>
				<FlatList style={styles.list} data={this.state.FinanceInfo} renderItem={this.renderItem} />

				<Button
					// onPress={onPressLearnMore}
					title="+"
					color="#009F4D"
					accessibilityLabel="Create a new Finance"
				/>
			</View>
		);
	}
}

const styles = StyleSheet.create({
	container: {
		flex: 1,
		backgroundColor: "#fafafa",
	},
	list: {
		padding: 20
	},
	productContainer: {
		backgroundColor: "#FFF",
		borderRadius: 5,
		padding: 20,
		marginBottom: 20,

		shadowColor: '#000',
		shadowOffset: { width: 0, height: 5 },
		shadowOpacity: 0.4,
		shadowRadius: 5,
		elevation: 2,
	},
	productTitle: {
		fontSize: 18,
		fontWeight: "bold",
		color: "#333"
	},
	productDescription: {
		fontSize: 16,
		color: '#999',
		marginTop: 5,
		lineHeight: 24
	},
	button: {
		width: 365,
		borderBottomWidth: 0,
		borderRadius: 50,
		alignItems: 'center',
	},
});
