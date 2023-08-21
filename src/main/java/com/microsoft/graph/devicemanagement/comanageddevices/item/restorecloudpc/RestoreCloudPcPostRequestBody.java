package com.microsoft.graph.devicemanagement.comanageddevices.item.restorecloudpc;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestoreCloudPcPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cloudPcSnapshotId property
     */
    private String cloudPcSnapshotId;
    /**
     * Instantiates a new restoreCloudPcPostRequestBody and sets the default values.
     */
    public RestoreCloudPcPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a restoreCloudPcPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RestoreCloudPcPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreCloudPcPostRequestBody();
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
     * Gets the cloudPcSnapshotId property value. The cloudPcSnapshotId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCloudPcSnapshotId() {
        return this.cloudPcSnapshotId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("cloudPcSnapshotId", (n) -> { this.setCloudPcSnapshotId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcSnapshotId", this.getCloudPcSnapshotId());
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
     * Sets the cloudPcSnapshotId property value. The cloudPcSnapshotId property
     * @param value Value to set for the cloudPcSnapshotId property.
     */
    public void setCloudPcSnapshotId(@jakarta.annotation.Nullable final String value) {
        this.cloudPcSnapshotId = value;
    }
}
