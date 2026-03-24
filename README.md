# Fitique SDK

Fitique is a Virtual Trial Room SDK that enables real-time augmented reality try-on experiences for clothing, accessories, and wearable products. It is designed as a developer-first infrastructure layer that can be embedded into any mobile app or website.

---

## Overview

Fitique is not a consumer-facing application. It is an SDK that allows businesses to integrate “try before you buy” functionality into their existing platforms.

The system uses real-time body pose estimation and image processing to overlay garments on a live camera feed. It works on standard devices without requiring specialized hardware or additional installations.

---

## Key Features

- Real-time body pose detection
- Live garment overlay on camera feed
- Support for:
  - Clothing (tops, bottoms, outfits)
  - Eyewear
  - Accessories
- Cross-platform architecture:
  - Android SDK (Primary)
  - Web SDK (Secondary)
- Firebase-based backend integration
- Easy SDK integration for developers

---

## Tech Stack

### Android SDK
- Kotlin
- CameraX
- MediaPipe Pose & Face Mesh
- TensorFlow Lite
- OpenCV
- OpenGL ES

### Web SDK
- TypeScript / JavaScript
- Vite
- WebRTC (getUserMedia)
- MediaPipe JS
- Canvas / WebGL

### Backend & Infrastructure
- Firebase Authentication
- Firebase Storage
- Firebase Hosting
- Firestore / BigQuery
- GitHub Actions (CI/CD)

---

## Project Structure


fitique-sdk/
├── android/ # Android SDK (Kotlin)
├── web/ # Web SDK (TypeScript + Vite)
├── .github/
│ └── workflows/ # CI/CD pipelines
├── .gitignore
└── README.md


---

## Getting Started

### Prerequisites

- Node.js (v20 or higher)
- Android Studio (latest version)
- Firebase CLI
- Git

---

### Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/fitique-sdk.git
cd fitique-sdk
Web Setup
cd web
npm install
npm run dev
Android Setup
Open the android/ folder in Android Studio
Sync Gradle
Add your Firebase config file:
android/app/google-services.json
Run the project on an emulator or device
Firebase Setup
Create a project in Firebase Console
Enable:
Authentication (Email/Password)
Hosting
Login and initialize Firebase:
firebase login
firebase init
CI/CD

GitHub Actions are configured for:

Android build (android-build.yml)
Web build (web-build.yml)

These workflows automatically run on every push to the main branch.

Usage
Android (Conceptual)
FitiqueSDK.init(context, apiKey)
FitiqueSDK.startTryOn(productImageUrl)
Web (Conceptual)
import { initFitique } from 'fitique-sdk';

initFitique({
  apiKey: 'YOUR_API_KEY'
});
Use Cases
Fashion e-commerce platforms
Direct-to-consumer (D2C) brands
Retail stores and kiosks
Eyewear and jewellery brands
AR/VR platforms
Roadmap
Android SDK (v1)
Web SDK (v1)
Accessories support (eyewear, jewellery)
iOS SDK
Analytics dashboard
Enterprise integrations
Status

In development (Prototype stage)

Team

3 Musketeers

License

Confidential – For internal use and hackathon evaluation only.
