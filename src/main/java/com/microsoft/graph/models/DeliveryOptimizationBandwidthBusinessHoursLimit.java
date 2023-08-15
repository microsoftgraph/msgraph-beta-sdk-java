package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bandwidth business hours and percentages type
 */
public class DeliveryOptimizationBandwidthBusinessHoursLimit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     */
    private Integer bandwidthBeginBusinessHours;
    /**
     * Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     */
    private Integer bandwidthEndBusinessHours;
    /**
     * Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     */
    private Integer bandwidthPercentageDuringBusinessHours;
    /**
     * Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     */
    private Integer bandwidthPercentageOutsideBusinessHours;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new deliveryOptimizationBandwidthBusinessHoursLimit and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deliveryOptimizationBandwidthBusinessHoursLimit
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationBandwidthBusinessHoursLimit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthBusinessHoursLimit();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthBeginBusinessHours() {
        return this.bandwidthBeginBusinessHours;
    }
    /**
     * Gets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthEndBusinessHours() {
        return this.bandwidthEndBusinessHours;
    }
    /**
     * Gets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthPercentageDuringBusinessHours() {
        return this.bandwidthPercentageDuringBusinessHours;
    }
    /**
     * Gets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthPercentageOutsideBusinessHours() {
        return this.bandwidthPercentageOutsideBusinessHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("bandwidthBeginBusinessHours", (n) -> { this.setBandwidthBeginBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthEndBusinessHours", (n) -> { this.setBandwidthEndBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthPercentageDuringBusinessHours", (n) -> { this.setBandwidthPercentageDuringBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthPercentageOutsideBusinessHours", (n) -> { this.setBandwidthPercentageOutsideBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bandwidthBeginBusinessHours", this.getBandwidthBeginBusinessHours());
        writer.writeIntegerValue("bandwidthEndBusinessHours", this.getBandwidthEndBusinessHours());
        writer.writeIntegerValue("bandwidthPercentageDuringBusinessHours", this.getBandwidthPercentageDuringBusinessHours());
        writer.writeIntegerValue("bandwidthPercentageOutsideBusinessHours", this.getBandwidthPercentageOutsideBusinessHours());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthBeginBusinessHours property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBandwidthBeginBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.bandwidthBeginBusinessHours = value;
    }
    /**
     * Sets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthEndBusinessHours property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBandwidthEndBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.bandwidthEndBusinessHours = value;
    }
    /**
     * Sets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageDuringBusinessHours property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBandwidthPercentageDuringBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.bandwidthPercentageDuringBusinessHours = value;
    }
    /**
     * Sets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageOutsideBusinessHours property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBandwidthPercentageOutsideBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.bandwidthPercentageOutsideBusinessHours = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
