import { createAppContainer, createStackNavigator } from 'react-navigation';

import Home from './pages/home';
import NewFinance from './pages/newFinance';
import UpdateFinance from './pages/updateFinance';
import Debts from './pages/debts';
import Balances from './pages/balances';

export default createAppContainer(
	createStackNavigator(
		{
			Home: { screen: Home },
			newFinance: { screen: NewFinance },
			updateFinance: { screen: UpdateFinance },
			debts: { screen: Debts },
			balances: { screen: Balances },

			navigationOptions: () => ({
				headerStyle: {
					backgroundColor: '#79D97C'
				},
				headerTintColor: '#79D97C'
			})
		}
	)
)