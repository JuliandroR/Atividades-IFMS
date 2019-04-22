import { createAppContainer, createStackNavigator } from 'react-navigation';

import Home from './pages/home';

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

			navigationOptions: () => ({
				headerStyle: {
					backgroundColor: '#59BEC9'
				},
				headerTintColor: '#0000'
			})
		}
	)
)