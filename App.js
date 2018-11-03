import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { Hi } from './shadow/demo.script';

export default class App extends React.Component {
  render() {
    return (
      <View style={styles.container}>
        <Hi/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
