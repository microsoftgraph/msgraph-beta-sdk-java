package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents one item in the list of freeze periods for Android Device Owner system updates */
public class AndroidDeviceOwnerSystemUpdateFreezePeriod implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The day of the end date of the freeze period. Valid values 1 to 31 */
    private Integer _endDay;
    /** The month of the end date of the freeze period. Valid values 1 to 12 */
    private Integer _endMonth;
    /** The OdataType property */
    private String _odataType;
    /** The day of the start date of the freeze period. Valid values 1 to 31 */
    private Integer _startDay;
    /** The month of the start date of the freeze period. Valid values 1 to 12 */
    private Integer _startMonth;
    /**
     * Instantiates a new androidDeviceOwnerSystemUpdateFreezePeriod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerSystemUpdateFreezePeriod() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidDeviceOwnerSystemUpdateFreezePeriod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerSystemUpdateFreezePeriod
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerSystemUpdateFreezePeriod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerSystemUpdateFreezePeriod();
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
     * Gets the endDay property value. The day of the end date of the freeze period. Valid values 1 to 31
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndDay() {
        return this._endDay;
    }
    /**
     * Gets the endMonth property value. The month of the end date of the freeze period. Valid values 1 to 12
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndMonth() {
        return this._endMonth;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerSystemUpdateFreezePeriod currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("endDay", (n) -> { currentObject.setEndDay(n.getIntegerValue()); });
        deserializerMap.put("endMonth", (n) -> { currentObject.setEndMonth(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDay", (n) -> { currentObject.setStartDay(n.getIntegerValue()); });
        deserializerMap.put("startMonth", (n) -> { currentObject.setStartMonth(n.getIntegerValue()); });
        return deserializerMap
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
     * Gets the startDay property value. The day of the start date of the freeze period. Valid values 1 to 31
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStartDay() {
        return this._startDay;
    }
    /**
     * Gets the startMonth property value. The month of the start date of the freeze period. Valid values 1 to 12
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStartMonth() {
        return this._startMonth;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("endDay", this.getEndDay());
        writer.writeIntegerValue("endMonth", this.getEndMonth());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("startDay", this.getStartDay());
        writer.writeIntegerValue("startMonth", this.getStartMonth());
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
     * Sets the endDay property value. The day of the end date of the freeze period. Valid values 1 to 31
     * @param value Value to set for the endDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDay(@javax.annotation.Nullable final Integer value) {
        this._endDay = value;
    }
    /**
     * Sets the endMonth property value. The month of the end date of the freeze period. Valid values 1 to 12
     * @param value Value to set for the endMonth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndMonth(@javax.annotation.Nullable final Integer value) {
        this._endMonth = value;
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
    /**
     * Sets the startDay property value. The day of the start date of the freeze period. Valid values 1 to 31
     * @param value Value to set for the startDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDay(@javax.annotation.Nullable final Integer value) {
        this._startDay = value;
    }
    /**
     * Sets the startMonth property value. The month of the start date of the freeze period. Valid values 1 to 12
     * @param value Value to set for the startMonth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMonth(@javax.annotation.Nullable final Integer value) {
        this._startMonth = value;
    }
}
