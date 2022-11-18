package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Bandwidth business hours and percentages type */
public class DeliveryOptimizationBandwidthBusinessHoursLimit implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23 */
    private Integer _bandwidthBeginBusinessHours;
    /** Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23 */
    private Integer _bandwidthEndBusinessHours;
    /** Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100 */
    private Integer _bandwidthPercentageDuringBusinessHours;
    /** Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100 */
    private Integer _bandwidthPercentageOutsideBusinessHours;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deliveryOptimizationBandwidthBusinessHoursLimit and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthBusinessHoursLimit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deliveryOptimizationBandwidthBusinessHoursLimit
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationBandwidthBusinessHoursLimit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthBusinessHoursLimit();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBandwidthBeginBusinessHours() {
        return this._bandwidthBeginBusinessHours;
    }
    /**
     * Gets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBandwidthEndBusinessHours() {
        return this._bandwidthEndBusinessHours;
    }
    /**
     * Gets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBandwidthPercentageDuringBusinessHours() {
        return this._bandwidthPercentageDuringBusinessHours;
    }
    /**
     * Gets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBandwidthPercentageOutsideBusinessHours() {
        return this._bandwidthPercentageOutsideBusinessHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationBandwidthBusinessHoursLimit currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("bandwidthBeginBusinessHours", (n) -> { currentObject.setBandwidthBeginBusinessHours(n.getIntegerValue()); });
            this.put("bandwidthEndBusinessHours", (n) -> { currentObject.setBandwidthEndBusinessHours(n.getIntegerValue()); });
            this.put("bandwidthPercentageDuringBusinessHours", (n) -> { currentObject.setBandwidthPercentageDuringBusinessHours(n.getIntegerValue()); });
            this.put("bandwidthPercentageOutsideBusinessHours", (n) -> { currentObject.setBandwidthPercentageOutsideBusinessHours(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthBeginBusinessHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthBeginBusinessHours(@javax.annotation.Nullable final Integer value) {
        this._bandwidthBeginBusinessHours = value;
    }
    /**
     * Sets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthEndBusinessHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthEndBusinessHours(@javax.annotation.Nullable final Integer value) {
        this._bandwidthEndBusinessHours = value;
    }
    /**
     * Sets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageDuringBusinessHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthPercentageDuringBusinessHours(@javax.annotation.Nullable final Integer value) {
        this._bandwidthPercentageDuringBusinessHours = value;
    }
    /**
     * Sets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageOutsideBusinessHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthPercentageOutsideBusinessHours(@javax.annotation.Nullable final Integer value) {
        this._bandwidthPercentageOutsideBusinessHours = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
