package com.modelos.eleccionCaso;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public record ConversionDeMonedas(@SerializedName("conversion_rates") Map<String, Double> convertidor) {
}
