<h1 align="center">PhotoListApp</h1>

<p align="center">  
 PhotoListApp demonstrates modern Android development with Coroutines, Coil, ViewModel, ViewBinding and Material Design based on MVVM architecture.
</p>
</br>

<p align="center">
<img src="/splash.png"  align="left" width="32%"/>
  <img src="/photolist.png"  align="center" width="32%"/>
  <img src="/photodetail.png" align="right" width="32%"/>
</p>

## Download
Go to the [Releases](https://github.com/EsracanGungor/PhotoListApp/releases) to download the latest APK.

<img src="/preview.gif" align="right" width="32%"/>

## Tech stack & Open-source libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- Jetpack
  - Lifecycle - Observe Android lifecycles and handle UI states upon the lifecycle changes.
  - ViewModel - Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
  - DataBinding - Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
- Architecture
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
- [Retrofit2](https://github.com/square/retrofit) - Construct the REST APIs.
- [Coil](https://github.com/coil-kt/coil) - Loading images from network.

## Architecture
PhotoListApp is based on the MVVM architecture pattern.

![architecture](https://user-images.githubusercontent.com/24237865/77502018-f7d36000-6e9c-11ea-92b0-1097240c8689.png)
