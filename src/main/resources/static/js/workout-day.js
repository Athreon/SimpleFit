const weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];

const d = new Date();
let day = weekday[d.getDay()];
let elementVideo = document.getElementById("video");
let elementText = document.getElementById("workout-text");

if (day === "Monday") {
      let iframe = document.createElement('iframe');
      iframe.src = 'https://www.youtube-nocookie.com/embed/Sqo29SsJqpA';
      iframe.width = '700';
      iframe.height = '500';
      elementVideo.appendChild(iframe);

      let hElement = document.createElement('h3');
      hElement.style.textAlign = "center";
      hElement.textContent = '15min Home Abs Workout!'
      elementText.appendChild(hElement);

      elementText.innerHTML += "Start your monday with home abs workout! Don’t get it wrong. The “abs” are extremely important. Not only do they round out the physique and look great, but abdominal strength also provides stability, supports good posture, and improves movement. Strong abdominals allow and enhance the full expression of a person’s athleticism. Running, jumping, lifting, throwing (balls, spears, or punches), and basically any movement all require—and are improved by—strong abs (i.e. a strong “core”). When you think about training the abs, consider what the abdominals’ purpose is: to provide a stable foundation for the rest of your body as it moves."
      elementText.appendChild(document.createElement('br'));
      elementText.appendChild(document.createElement('br'));
      elementText.innerHTML += "Abs workout:"
      elementText.appendChild(document.createElement('br'));
      elementText.appendChild(document.createElement('br'));
      elementText.innerHTML += "Ab Rollout (8-10 reps)"
      elementText.appendChild(document.createElement('br'));
      elementText.innerHTML += "Leg Raise Hip Thrust (10 reps)"
      elementText.appendChild(document.createElement('br'));
      elementText.innerHTML += "Partial Leg Raise (10 reps)"
      elementText.appendChild(document.createElement('br'));
      elementText.innerHTML += "Crunch (10-12 reps)"
  }
else if (day === "Tuesday") {
     let iframe = document.createElement('iframe');
     iframe.src = 'https://www.youtube-nocookie.com/embed/38sObvTwfDg?start=24';
     iframe.width = '700';
     iframe.height = '500';
     elementVideo.appendChild(iframe);

     let hElement = document.createElement('h3');
     hElement.style.textAlign = "center";
     hElement.textContent = 'Boulder Shoulders with Jo!'
     elementText.appendChild(hElement);

     elementText.innerHTML += "Broad shoulders are a body image ideal that has been dished out to us over several centuries. Remember Michelangelo’s famous statue of David from the early the 16th century? Or David Beckham’s from closer to our time? Then again, strong and healthy shoulders are essential for almost all tasks and exercises we perform starting with our posture to carrying a backpack or doing a basic exercise such as the pushup. From day-to-day life tasks like lifting or carrying things to even having a good upright posture shoulders play an important functional role in our lives."
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Shoulders Routine:"
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Barbell Overhead Press"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Half-Kneeling Landmine Press"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Arnold Press"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Push Press"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Leaning Lateral Raise"
}
else if (day === "Wednesday") {
    let iframe = document.createElement('iframe');
    iframe.src = 'https://www.youtube-nocookie.com/embed/k1cLRd7cahQ';
    iframe.width = '700';
    iframe.height = '500';
    elementVideo.appendChild(iframe);

    let hElement = document.createElement('h3');
    hElement.style.textAlign = "center";
    hElement.textContent = 'Full Core Split!'
    elementText.appendChild(hElement);

    elementText.innerHTML += "Your abdominal muscles play a crucial role in providing stability for your spine and helping you move your body. Increasing your core strength and stability is a worthwhile goal, but many people may confuse ab workouts with those that can burn fat. Striving to improve your strength, stability, and daily functioning will improve your life immeasurably. Our bodies function as a whole, both as we exercise and as we lose or gain body fat and muscle. Body shape is unique and often out of our control. Work on the things you can control, like your diet, exercise, stress levels, and sleep management."
    elementText.appendChild(document.createElement('br'));
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Check Mike's routine which follows:"
    elementText.appendChild(document.createElement('br'));
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Reverse Crunch (Reps 8-10)"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Ab Rollout (Reps - 8-10)"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Decline Crunch/GHR Crunch (Reps - 8-10)"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Rope Crunch (Reps - 10-15)"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Hanging Knee Raise (Reps 6-10)"
}
else if (day === "Thursday") {
     let iframe = document.createElement('iframe');
     iframe.src = 'https://www.youtube-nocookie.com/embed/KKBY35zs0rc?start=7';
     iframe.width = '700';
     iframe.height = '500';
     elementVideo.appendChild(iframe);

     let hElement = document.createElement('h3');
     hElement.style.textAlign = "center";
     hElement.textContent = 'Back Training!'
     elementText.appendChild(hElement);

     elementText.innerHTML += "You’ve heard the phrase, “Never Miss a Monday.” We’ve got a new one that is just as important - “Never Miss Back Day!”. Adding a back-focused workout to your fitness routine will not only improve your overall strength but can reduce back pain and support great form and posture. By strengthening your back muscles, you’re building up the main support structure for your entire body. A healthy and strong back will stabilize and brace your spine, making attaining those health and fitness goals even easier."
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Build big back with these exercises:"
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Deadlift"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Pull-Up"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Bent-Over Row"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Lat Pull-Down"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Single-Arm Dumbbell Row"
}
else if (day === "Friday") {
    let iframe = document.createElement('iframe');
    iframe.src = 'https://www.youtube-nocookie.com/embed/b6J2YrfEwtQ?start=4';
    iframe.width = '700';
    iframe.height = '500';
    elementVideo.appendChild(iframe);

    let hElement = document.createElement('h3');
    hElement.style.textAlign = "center";
    hElement.textContent = 'Never skip leg day with Jo Lindner'
    elementText.appendChild(hElement);

    elementText.innerHTML += "Leg workouts are an important aspect of a balanced, whole-body fitness routine that builds strength, speed, and stability. It’s important to stay consistent with your leg workouts since these large muscles are an integral part of your overall fitness. Plus, it’s easier for your body to adapt to the workouts and develop good habits that will help you to meet your fitness goals. Strong leg muscles keep your body balanced, which isn’t possible if you focus solely on your upper body. Working your glutes, quads, and hamstrings with exercises such as deadlifts, squats, and lunges helps to maximize and boost athletic performance."
    elementText.appendChild(document.createElement('br'));
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Start building your legs with:"
    elementText.appendChild(document.createElement('br'));
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Regular Stance Squats"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Narrow Stance Squats"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Sumo Stance Squats"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Front Squats"
    elementText.appendChild(document.createElement('br'));
    elementText.innerHTML += "Standing Calf Raise"
}
else if (day === "Saturday") {
     let iframe = document.createElement('iframe');
     iframe.src = 'https://www.youtube-nocookie.com/embed/pSeMvpLINTg';
     iframe.width = '700';
     iframe.height = '500';
     elementVideo.appendChild(iframe);

     let hElement = document.createElement('h3');
     hElement.style.textAlign = "center";
     hElement.textContent = 'Biceps Split Saturday!'
     elementText.appendChild(hElement);

     elementText.innerHTML += "Strong biceps play an important role in an overall strong and functional upper body. Building bicep strength helps you perform everyday tasks such as carrying and lifting. There are some unique tips to know for optimal biceps training to make the most of your workouts. Some people simply use too much weight. Instead of using a concentrated movement, they will often grab a barbell or dumbbell far too heavy and end up swinging the body to lift the weight. All this does is distribute the effort to numerous muscle groups, including the shoulders, back, and hips."
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Jo's routine follows:"
     elementText.appendChild(document.createElement('br'));
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "EZ-Bar Preacher Curl"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Barbell Curl"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Incline Dumbbell Curl"
     elementText.appendChild(document.createElement('br'));
     elementText.innerHTML += "Cable Curl"
}
else if (day === "Sunday") {
       let iframe = document.createElement('iframe');
       iframe.src = 'https://www.youtube-nocookie.com/embed/OieSsqPlupg';
       iframe.width = '700';
       iframe.height = '500';
       elementVideo.appendChild(iframe);

       let hElement = document.createElement('h3');
       hElement.style.textAlign = "center";
       hElement.textContent = 'Shoulders & Arms Split!'
       elementText.appendChild(hElement);

       elementText.innerHTML += "Broad shoulders are a body image ideal that has been dished out to us over several centuries. Remember Michelangelo’s famous statue of David from the early the 16th century? Or David Beckham’s from closer to our time? Then again, strong and healthy shoulders are essential for almost all tasks and exercises we perform starting with our posture to carrying a backpack or doing a basic exercise such as the pushup. From day-to-day life tasks like lifting or carrying things to even having a good upright posture shoulders play an important functional role in our lives."
       elementText.appendChild(document.createElement('br'));
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Shoulders Routine:"
       elementText.appendChild(document.createElement('br'));
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Arnold Press"
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Push Press"
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Barbell Overhead Press"
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Half-Kneeling Landmine Press"
       elementText.appendChild(document.createElement('br'));
       elementText.innerHTML += "Leaning Lateral Raise"
}


