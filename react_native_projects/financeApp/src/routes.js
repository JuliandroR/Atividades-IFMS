import { createAppContainer, createStackNavigator } from 'react-navigation';

import Home from './pages/home';
import NewFinance from './pages/newFinance';
import UpdateFinance from './pages/updateFinance';
import Debts from './pages/debts';
import Balances from './pages/balances';

const defaultStyle = {
	headerStyle: {
		backgroundColor: '#00A376'
	},
	headerTintColor: '#D9D9D6'
}

export default createAppContainer(
	createStackNavigator(
		{
			Home: {
				screen: Home,
				navigationOptions: () => defaultStyle
			},
			newFinance: {
				screen: NewFinance,
				navigationOptions: () => defaultStyle
			},
			updateFinance: {
				screen: UpdateFinance,
				navigationOptions: () => defaultStyle
			},
			debts: {
				screen: Debts,
				navigationOptions: () => defaultStyle
			},
			balances: {
				screen: Balances,
				navigationOptions: () => defaultStyle
			},
		}
	)
)