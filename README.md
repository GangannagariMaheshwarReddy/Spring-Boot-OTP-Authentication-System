🌟 SPRING BOOT OTP AUTHENTICATION SYSTEM---
(With Email OTP, MySQL, Inline CSS UI)

A complete OTP-based login system built using Spring Boot + MySQL + Spring Mail, including user registration, login, OTP verification, and a dashboard page styled using inline CSS.

🚀 Features

✔ User Registration

✔ Login with Username + Password

✔ OTP Generation (6-digit)

✔ OTP Reuse if not expired

✔ OTP Expiry (60 seconds)

✔ Email OTP sending through Spring Mail

✔ Dashboard screen

✔ Inline CSS UI (no external CSS files)

✔ Clean MVC structure

✔ Two Entities: Appuser & userotp

✔ Test It in WEBPAGE Using EndPoints using your localhost.

---

🎨 Frontend UI (Inline CSS Included)

This project uses HTML pages with inline CSS for:

Register page

Login page

OTP Verification page

Dashboard page

---

🧩 Backend Flow
1️⃣ Register User

Stores name, age, email, phone, password.

2️⃣ Login User

Validates the username & password.

3️⃣ Generate OTP

Reuse OTP if still valid

Create new OTP if expired

Save OTP in database

4️⃣ Email OTP

Sent through Gmail SMTP.

5️⃣ Verify OTP

If correct → redirect to dashboard.

----

🌐 Available Endpoints
Method	Endpoint	Purpose

GET  	/	  Registration Page

POST	 /Register	  Save User

GET	/login	    Login Page

POST	/loginuser	     Validate user + send OTP

POST	/verifyotp	      Validate OTP

GET	/dashbord	         Dashboard page
