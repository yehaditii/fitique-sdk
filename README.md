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
