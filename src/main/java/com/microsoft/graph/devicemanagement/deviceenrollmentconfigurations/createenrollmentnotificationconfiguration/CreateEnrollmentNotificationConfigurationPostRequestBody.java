package com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.createenrollmentnotificationconfiguration;

import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the createEnrollmentNotificationConfiguration method. */
public class CreateEnrollmentNotificationConfigurationPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceEnrollmentNotificationConfigurations property */
    private java.util.List<DeviceEnrollmentConfiguration> _deviceEnrollmentNotificationConfigurations;
    /**
     * Instantiates a new createEnrollmentNotificationConfigurationPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreateEnrollmentNotificationConfigurationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createEnrollmentNotificationConfigurationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateEnrollmentNotificationConfigurationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEnrollmentNotificationConfigurationPostRequestBody();
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
     * Gets the deviceEnrollmentNotificationConfigurations property value. The deviceEnrollmentNotificationConfigurations property
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentNotificationConfigurations() {
        return this._deviceEnrollmentNotificationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateEnrollmentNotificationConfigurationPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("deviceEnrollmentNotificationConfigurations", (n) -> { currentObject.setDeviceEnrollmentNotificationConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceEnrollmentNotificationConfigurations", this.getDeviceEnrollmentNotificationConfigurations());
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
     * Sets the deviceEnrollmentNotificationConfigurations property value. The deviceEnrollmentNotificationConfigurations property
     * @param value Value to set for the deviceEnrollmentNotificationConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentNotificationConfigurations(@javax.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this._deviceEnrollmentNotificationConfigurations = value;
    }
}
