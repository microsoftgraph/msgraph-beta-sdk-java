package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserProfileSnapshotCreateBulkActionResult extends CloudPcUserProfileBulkActionResult implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserProfileSnapshotCreateBulkActionResult} and sets the default values.
     */
    public CloudPcUserProfileSnapshotCreateBulkActionResult() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcUserProfileSnapshotCreateBulkActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserProfileSnapshotCreateBulkActionResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserProfileSnapshotCreateBulkActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserProfileSnapshotCreateBulkActionResult();
    }
    /**
     * Gets the failedCloudProfileIds property value. The failedCloudProfileIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedCloudProfileIds() {
        return this.backingStore.get("failedCloudProfileIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedCloudProfileIds", (n) -> { this.setFailedCloudProfileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("failedCloudProfileIds", this.getFailedCloudProfileIds());
    }
    /**
     * Sets the failedCloudProfileIds property value. The failedCloudProfileIds property
     * @param value Value to set for the failedCloudProfileIds property.
     */
    public void setFailedCloudProfileIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("failedCloudProfileIds", value);
    }
}
