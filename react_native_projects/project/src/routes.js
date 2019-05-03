import { createAppContainer, createStackNavigator } from 'react-navigation';

import Home from './pages/home';
import NewFinance from './pages/newFinance';
import UpdateFinance from './pages/updateFinance';

// export default createStackNavigator(
// 	{
// 		Home
// 	},
// 	{ // Configuração do estilo da barra de título
// 		navigationOptions: {
// 			headerStyle: {
// 				backgroundColor: '#59BEC9'
// 			},
// 			headerTintColor: '#0000'
// 		}
// 	}
// );


export default createAppContainer(
	createStackNavigator(
		{
			Home: { screen: Home },
			newFinance: { screen: NewFinance },
			updateFinance: { screen: UpdateFinance },

			navigationOptions: () => ({
				headerStyle: {
					backgroundColor: '#79D97C'
				},
				headerTintColor: '#79D97C'
			})
		}
	)
)