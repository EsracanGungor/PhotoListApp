<h1 align="center">PhotoListApp</h1>

<p align="center">  
 PhotoListApp demonstrates modern Android development with Coroutines, Coil, ViewModel, ViewBinding and Material Design based on MVVM architecture.
</p>
</br>

<table>
  <tr>
    <td>Splash Screen Page</td>
     <td>Photo List Page</td>
     <td>Photo Detail Page</td>
  </tr>
  <tr>
    <td><img src="/previews/splash.png" ></td>
    <td><img src="/previews/photolist.png" ></td>
    <td><img src="/previews/photodetail.png" ></td>
  </tr>
 </table>
 
## Functionality
The app's functionality includes:
1. Fetch a list of images from picsum photos api (https://picsum.photos/) and shows them in RecyclerView.
2. When an image is selected from the RecyclerView, the author of the image will load the image along with its height information.
3. The app supports SwipeRefreshLayout to refresh RecyclerView content from remote source.

## Tech Stack & Open-source Libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/), [Android appcompat](https://developer.android.com/jetpack/androidx/releases/appcompat)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations and Network call .
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle) for observe Android lifecycles and handle UI states upon the lifecycle changes.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) for manage UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
- [DataBinding](https://developer.android.com/topic/libraries/data-binding) for bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
- [Android View Binding](https://developer.android.com/topic/libraries/view-binding)
- [Retrofit2](https://github.com/square/retrofit) for REST API communication.
- [Coil](https://github.com/coil-kt/coil) for loading images from network.
- [Swipe Refresh Layout](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout) for refresh RecyclerView content.
- [Navigation](https://developer.android.com/guide/navigation)

## Architecture
PhotoListApp is based on the clean architecture with MVVM(Model - View - View Model) design pattern.

## Download
Go to the [Releases](https://github.com/EsracanGungor/PhotoListApp/releases) to download the APK.
