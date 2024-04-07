import SwiftUI
import home

struct ContentView: View {
    let greet1 = FirstGreeting().greet()


	var body: some View {
		Text(greet1)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
