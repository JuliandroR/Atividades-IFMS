import React, { Component } from 'react';

import { Text, View, TextInput } from 'react-native';

const updateFinance = ({ navigation }) => {

    state = {
        title: "",
        type: navigation.state.params.finance.type,
        value: navigation.state.params.finance.value,

    };


    return (
        <View>
            {/* <Text>{navigation.state.params.finance.title}</Text>
            <Text>{navigation.state.params.finance.value}</Text> */}

            <TextInput
                onChangeText={(title) => {
                    this.setState({ title })
                }}
                value={navigation.state.params.finance.title}
            />
        </View>
    )
}

updateFinance.navigationOptions = () => ({
    title: "Editar Finança"
});

export default updateFinance;

// export default class updateFinance extends Component {


//     constructor(navigation) {
//         this.state = {
//             title: navigation.state.params.finance.title,
//             type: navigation.state.params.finance.type,
//             value: navigation.state.params.finance.value
//         };
//     };

//     render() {
//         return (
//             <TextInput
//                 onChangeText={(title) => this.setState({ title })}
//                 value={this.state.text}
//             />
//         );
//     }
// }