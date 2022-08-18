let baseValue = 0;

function updateMacros(obj) {
        localStorage.setItem("macros", baseValue);
}

function calculateCalorie(obj)
    {
        const age = obj.form.age.value;
        const gender = obj.form.gender.value;
        const bodyFat = obj.form.bodyFat.value;
        const height = obj.form.height.value;
        const weight = obj.form.weight.value;
        const activity = obj.form.activity.value;
        const unit = obj.form.unit.value;
        const formula = obj.form.formula.value;

        let BMR = '';
        if(formula == 0)
        {
            BMR = Mifflin(gender, age, bodyFat, height, weight);
        }
        else if(formula == 1)
        {
            BMR = Harris(gender, age, bodyFat, height, weight);
        }
        else if(formula == 2)
        {
            BMR = Katch(bodyFat, weight);
        }

        let ret = parseFloat(BMR)*parseFloat(activity);
        if(unit == 'kilojoules')
        {
            ret = (ret*4.1868);
        }

        baseValue = "Your daily minimum calories are " + Math.ceil(ret) + " " + unit;

        document.querySelector(".ans_calculate")
        .innerHTML = '<div class="container"><h4 class="text-center form-control my-3 fs-4">You should consume <span>'
        +Math.ceil(ret)+' '+unit+'/day </span> of calorie to maintain your weight.</h4></div>';

        document.querySelector(".calc-add")
        .innerHTML = '<div>Do you want to add your macros to the home board and the food table?<button style="margin: 215px; width: 90px; margin-top: 28px;" class="btn btn-success" type="button" onclick="updateMacros(this)">Add</button></div>';
    }

    function Mifflin(gender, age, bodyFat, height, weight)
    {
        let BMR = (10*weight) + (6.25*height) - (5*age) + 5;
        if(gender == 1)
        {
            BMR = (10*weight) + (6.25*height) - (5*age) - 161;
        }

        return BMR;
    }

    function Harris(gender, age, bodyFat, height, weight)
    {
        let BMR = (13.397*weight) + (4.799*height) - (5.677*age) + 88.362;
        if(gender == 1)
        {
            BMR = (9.247*weight) + (3.098*height) - (4.330*age) + 447.593;
        }

        return BMR;
    }

    function Katch(bodyFat, weight)
    {
        let BMR = 370 + 21.6*(1 - (bodyFat/100))*weight;

        return BMR;
    }