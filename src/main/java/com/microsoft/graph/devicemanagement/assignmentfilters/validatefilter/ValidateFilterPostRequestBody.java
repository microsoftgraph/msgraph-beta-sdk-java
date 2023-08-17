package com.microsoft.graph.devicemanagement.assignmentfilters.validatefilter;

import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidateFilterPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceAndAppManagementAssignmentFilter property
     */
    private DeviceAndAppManagementAssignmentFilter deviceAndAppManagementAssignmentFilter;
    /**
     * Instantiates a new validateFilterPostRequestBody and sets the default values.
     */
    public ValidateFilterPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateFilterPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ValidateFilterPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateFilterPostRequestBody();
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
     * Gets the deviceAndAppManagementAssignmentFilter property value. The deviceAndAppManagementAssignmentFilter property
     * @return a deviceAndAppManagementAssignmentFilter
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilter getDeviceAndAppManagementAssignmentFilter() {
        return this.deviceAndAppManagementAssignmentFilter;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("deviceAndAppManagementAssignmentFilter", (n) -> { this.setDeviceAndAppManagementAssignmentFilter(n.getObjectValue(DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceAndAppManagementAssignmentFilter", this.getDeviceAndAppManagementAssignmentFilter());
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
     * Sets the deviceAndAppManagementAssignmentFilter property value. The deviceAndAppManagementAssignmentFilter property
     * @param value Value to set for the deviceAndAppManagementAssignmentFilter property.
     */
    public void setDeviceAndAppManagementAssignmentFilter(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentFilter value) {
        this.deviceAndAppManagementAssignmentFilter = value;
    }
}
