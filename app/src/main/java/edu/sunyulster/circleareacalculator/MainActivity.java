package edu.sunyulster.circleareacalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import edu.sunyulster.circleareacalculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void calculateArea(View view) {
        double radius = Double.parseDouble(binding.radiusInputField.getText().toString());
        if (radius < 0) {
            binding.answer.setTextColor(getColor(R.color.red));
            binding.answer.setText("r must be a positive number");
        } else {
            double area = Math.PI * radius * radius;
            binding.answer.setTextColor(getColor(R.color.green));
            binding.answer.setText(String.format("A = π*%f^2 ≈ %.4f", radius, area));
        }

    }
}