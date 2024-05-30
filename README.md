Food App having Activity like splash screen, MealActivity , Fragmnets Home, Favourites and Categories.

MVVM: Model View ViewModel

Model represet the entity

View represent the UI

View Model: The ViewModel class is a business logic or screen level state holder.
It exposes state to the UI and encapsulates related business logic. 
Its principal advantage is that it caches state and persists it through configuration changes. 
This means that your UI doesn’t have to fetch data again when navigating between activities, 
or following configuration changes, such as when rotating the screen.

Retrofit: Retrofit is a popular HTTP client library for Android and Java that simplifies 
the process of making network requests and parsing responses using a type-safe API based on Java interfaces.

Glide: Glide is an image loading and caching library for Android.

Live Data: LiveData is a data holder class in Android's Jetpack library that is lifecycle-aware, meaning it respects the
lifecycle of other app components (like activities, fragments, or services) and only updates 
observers (such as UI components) that are in an active lifecycle state, helping to prevent memory leaks and crashes.

ROOM: Room is a persistence library that provides an abstraction layer over SQLite.
 It simplifies database interactions and provides compile-time verification of SQL queries.
 Room consists of three main components: 
 entities, 
 DAOs (Data Access Objects),
 and the database itself.
 It is part of the Android Jetpack library and is widely used in Android app development for managing local databases efficiently.
