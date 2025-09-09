# HealthCare App

![HealthCare Logo](app/src/main/res/mipmap/ic_launcher.png)

HealthCare App is an Android application designed to provide users with quick access to healthcare information, nearby hospitals, medicine guidance, and emergency contacts. It is aimed at making healthcare information and services easily accessible for everyone.

---

## 🚀 Features

- **Home Screen**
  - Quick navigation to Ambulance, Pills, Near Me (hospitals), and About Us sections.

- **Ambulance Activity**
  - Direct dial buttons for emergency ambulance services in different areas.

- **Pills Activity**
  - Lists medicines for common conditions like Allergy, Fever, Gastric, and Diarrhea with details.
  - Custom ListView with images, titles, and descriptions.

- **Hospital Activity**
  - Find nearby hospitals quickly.

- **About Activity**
  - Displays app information, developer info, and social media links.
  - Uses `mehdi.sakout:android-about-page` library.
  - Dynamic current year displayed automatically.

- **Modern Design**
  - AndroidX libraries (AppCompat, ConstraintLayout) for modern support and compatibility.

---

## 🛠️ Libraries & Dependencies

- **AndroidX**
  - AppCompat, ConstraintLayout, Test Libraries
- **AboutPage**
  - `com.github.medyo:android-about-page:v1.3.1` (via JitPack)
- **Gradle Plugin**
  - 8.13.0
- **Minimum SDK**
  - 19
- **Target & Compile SDK**
  - 33
- **JDK**
  - 17

---

## ⚙️ Setup Instructions

1. **Clone the repository**
```bash
git clone https://github.com/fahmidtasin/HealthCare

2. **Open the project**
   - Open Android Studio → `File` → `Open` → Select `HealthCare` folder.

3. **Sync Gradle**
   - Make sure Gradle syncs successfully.
   - Ensure JDK 17 is selected in **Project Structure → SDK Location**.

4. **Build & Run**
   - Connect an Android device or start an emulator.
   - Click **Run → Run 'app'**.

---

## 🔧 Notes

- Internet connection is required for downloading Gradle dependencies and AboutPage library via JitPack.
- All activities now have `android:exported="true"` for Android 12+ compatibility.
- Migration to AndroidX ensures modern support and reduces deprecated APIs.
- Dynamic current year in About section ensures the app always looks up-to-date.

---

## 👨‍💻 Developer

**Fahmid Shafath Tasin**   
- Social Media:
  - Facebook: [fahmid.tasin](https://www.facebook.com/fahmid.tasin)
  - Instagram: fahmidtasin

---

## 🎯 License

This project is for educational and personal use. For commercial use, please contact the developer.
