package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes the features of a device that are shared between all devices in a correlation group.
 */
public class UserExperienceAnalyticsAnomalyCorrelationGroupFeature implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates the device's feature type. Possible values are: manufacturer, model, osVersion, application or driver.
     */
    private UserExperienceAnalyticsAnomalyDeviceFeatureType deviceFeatureType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specific metric values that describe the features of the given device feature type.
     */
    private java.util.List<String> values;
    /**
     * Instantiates a new userExperienceAnalyticsAnomalyCorrelationGroupFeature and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyCorrelationGroupFeature() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAnomalyCorrelationGroupFeature
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAnomalyCorrelationGroupFeature createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomalyCorrelationGroupFeature();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceFeatureType property value. Indicates the device's feature type. Possible values are: manufacturer, model, osVersion, application or driver.
     * @return a UserExperienceAnalyticsAnomalyDeviceFeatureType
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyDeviceFeatureType getDeviceFeatureType() {
        return this.deviceFeatureType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deviceFeatureType", (n) -> { this.setDeviceFeatureType(n.getEnumValue(UserExperienceAnalyticsAnomalyDeviceFeatureType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the values property value. Specific metric values that describe the features of the given device feature type.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceFeatureType", this.getDeviceFeatureType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceFeatureType property value. Indicates the device's feature type. Possible values are: manufacturer, model, osVersion, application or driver.
     * @param value Value to set for the deviceFeatureType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceFeatureType(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalyDeviceFeatureType value) {
        this.deviceFeatureType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the values property value. Specific metric values that describe the features of the given device feature type.
     * @param value Value to set for the values property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this.values = value;
    }
}
