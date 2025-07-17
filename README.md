# 📝 NotesCompose
**Modern Note-Taking App with Jetpack Compose & MVI Architecture**

<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
  <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose"/>
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
  <img src="https://img.shields.io/badge/MVI-FF6B6B?style=for-the-badge" alt="MVI"/>
</div>

<div align="center">
  <img src="https://user-images.githubusercontent.com/32034127/174104639-536932f4-fb9e-4e3f-828d-185a09a6f48f.png" alt="NotesCompose Screenshot" width="300"/>
</div>

## ✨ Key Features

### 🎨 **Modern UI/UX**
- **100% Jetpack Compose** - No XML layouts, pure declarative UI
- **Material Design 3** theming with dynamic colors
- **Dark/Light Mode** support following system preferences
- **Smooth animations** and intuitive navigation
- **Responsive layout** adapting to different screen sizes

### 🏗️ **Advanced Architecture**
- **MVI (Model-View-Intent)** pattern for predictable state management
- **Unidirectional Data Flow** ensuring consistency and debugging ease
- **State Hoisting** following Compose best practices
- **Reactive Programming** with Kotlin Flow for real-time updates

### 💾 **Data Management**
- **Room Database** with modern Kotlin APIs
- **Flow-based** reactive data queries
- **Type-safe** database operations
- **Offline-first** approach with local storage

### 🔧 **Development Excellence**
- **Dependency Injection** with Hilt for clean architecture
- **100% Kotlin** codebase following modern conventions
- **Coroutines** for asynchronous operations
- **Modular structure** for maintainability and testing

## 🛠️ Technology Stack

### **UI Layer**
- **[Jetpack Compose](https://developer.android.com/jetpack/compose)** - Modern declarative UI toolkit
- **[Material 3](https://m3.material.io/)** - Latest Material Design system
- **[Compose Navigation](https://developer.android.com/jetpack/compose/navigation)** - Type-safe navigation

### **Architecture & State Management**
- **[MVI](https://www.raywenderlich.com/817602-mvi-architecture-for-android-tutorial-getting-started)** - Model-View-Intent pattern
- **[Kotlin Flow](https://kotlinlang.org/docs/flow.html)** - Reactive streams for state management
- **[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)** - UI-related data holder

### **Data & Persistence**
- **[Room](https://developer.android.com/training/data-storage/room)** - SQLite abstraction with compile-time verification
- **[Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)** - Asynchronous programming

### **Dependency Injection**
- **[Hilt](https://dagger.dev/hilt/)** - Dependency injection framework built on Dagger

## 🏗️ Architecture Overview

```
📱 NotesCompose/
├── 🎨 UI Layer (Compose)
│   ├── Screens (Note List, Note Detail, Settings)
│   ├── Components (NoteCard, SearchBar, FAB)
│   └── Theme (Colors, Typography, Shapes)
│
├── 🧠 Domain Layer
│   ├── Models (Note, Category, Tag)
│   ├── Use Cases (CreateNote, DeleteNote, SearchNotes)
│   └── Repository Interface
│
├── 📊 Data Layer
│   ├── Local (Room Database, DAOs)
│   ├── Repository Implementation
│   └── Data Sources
│
└── 🔧 DI Layer (Hilt Modules)
    ├── Database Module
    ├── Repository Module
    └── Use Case Module
```

## 🚀 Getting Started

### **Prerequisites**
- **Android Studio** Hedgehog (2023.1.1) or newer
- **JDK 17** or higher
- **Android SDK** 34 or higher
- **Kotlin** 1.9.0 or higher

### **Installation**
```bash
# 1. Clone the repository
git clone https://github.com/tech1ee/NotesCompose.git

# 2. Open in Android Studio
cd NotesCompose
# File → Open → Select project folder

# 3. Sync project with Gradle files
# 4. Run on device or emulator
```

### **Build Variants**
```bash
# Debug build with logging
./gradlew assembleDebug

# Release build (optimized)
./gradlew assembleRelease

# Run tests
./gradlew test
```

## 📱 Features Deep Dive

### **Note Management**
- ✅ **Create/Edit/Delete** notes with rich text support
- ✅ **Auto-save** functionality preventing data loss
- ✅ **Search & Filter** notes by title, content, or tags
- ✅ **Categorization** with custom categories and colors
- ✅ **Import/Export** functionality for data portability

### **User Experience**
- ✅ **Gesture Support** - Swipe to delete, pull to refresh
- ✅ **Keyboard Shortcuts** for power users
- ✅ **Accessibility** compliance with TalkBack support
- ✅ **Performance Optimized** - Lazy loading and efficient rendering

### **Data Management**
- ✅ **Offline-First** - Works without internet connection
- ✅ **Data Persistence** with Room database
- ✅ **Backup & Restore** functionality
- ✅ **Migration Support** for database schema updates

## 🧪 Testing Strategy

### **Unit Tests**
```kotlin
// ViewModel testing with StateFlow
@Test
fun `create note updates state correctly`() = runTest {
    val viewModel = NotesViewModel(createNoteUseCase, ...)
    
    viewModel.createNote("Test Title", "Test Content")
    
    val state = viewModel.uiState.value
    assertTrue(state.notes.any { it.title == "Test Title" })
}
```

### **Compose UI Tests**
```kotlin
// Testing Compose components
@Test
fun noteCard_displaysCorrectContent() {
    composeTestRule.setContent {
        NoteCard(note = sampleNote, onClick = {})
    }
    
    composeTestRule
        .onNodeWithText("Sample Title")
        .assertIsDisplayed()
}
```

## 🎯 Professional Highlights

### **Modern Android Development**
- 📱 **Latest Android APIs** and development practices
- 🎨 **Jetpack Compose** expertise with complex UI implementations
- 🏗️ **Clean Architecture** principles for maintainable code
- 🔄 **Reactive Programming** with Flow and Compose state

### **Performance & Quality**
- ⚡ **Optimized Rendering** with efficient Compose recomposition
- 🧪 **Comprehensive Testing** strategy for reliability
- 📊 **Memory Efficient** with proper lifecycle management
- 🔒 **Type Safety** throughout the entire codebase

### **Industry Best Practices**
- 📝 **SOLID Principles** application
- 🔧 **Dependency Injection** for testability
- 📱 **Material Design** compliance
- 🌐 **Accessibility** considerations

## 🤝 Contributing

This project showcases **modern Android development techniques** and serves as a **portfolio piece**. 

### **What This Demonstrates**
- ✅ **Senior-level** Android development skills
- ✅ **Modern tech stack** proficiency
- ✅ **Architecture design** capabilities
- ✅ **Best practices** implementation
- ✅ **Production-ready** code quality

Feel free to explore the code, suggest improvements, or use it as a reference for your own projects!

## 📧 Contact & Collaboration

**Interested in discussing this project or potential opportunities?**

📧 **Email:** t3ch1ee@gmail.com  
💼 **Portfolio:** [github.com/tech1ee](https://github.com/tech1ee)  
🌍 **Available for Remote Android Development Opportunities**

---

<div align="center">

⭐ **Star this repository if you found it useful!** ⭐

</div>