package com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.createenrollmentnotificationconfiguration;

import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateEnrollmentNotificationConfigurationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceEnrollmentNotificationConfigurations property
     */
    private java.util.List<DeviceEnrollmentConfiguration> deviceEnrollmentNotificationConfigurations;
    /**
     * Instantiates a new createEnrollmentNotificationConfigurationPostRequestBody and sets the default values.
     */
    public CreateEnrollmentNotificationConfigurationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createEnrollmentNotificationConfigurationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CreateEnrollmentNotificationConfigurationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEnrollmentNotificationConfigurationPostRequestBody();
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
     * Gets the deviceEnrollmentNotificationConfigurations property value. The deviceEnrollmentNotificationConfigurations property
     * @return a deviceEnrollmentConfiguration
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentNotificationConfigurations() {
        return this.deviceEnrollmentNotificationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("deviceEnrollmentNotificationConfigurations", (n) -> { this.setDeviceEnrollmentNotificationConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceEnrollmentNotificationConfigurations", this.getDeviceEnrollmentNotificationConfigurations());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceEnrollmentNotificationConfigurations property value. The deviceEnrollmentNotificationConfigurations property
     * @param value Value to set for the deviceEnrollmentNotificationConfigurations property.
     */
    public void setDeviceEnrollmentNotificationConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this.deviceEnrollmentNotificationConfigurations = value;
    }
}
