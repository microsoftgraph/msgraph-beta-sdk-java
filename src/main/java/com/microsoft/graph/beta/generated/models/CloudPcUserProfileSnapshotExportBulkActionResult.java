package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserProfileSnapshotExportBulkActionResult extends CloudPcUserProfileBulkActionResult implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserProfileSnapshotExportBulkActionResult} and sets the default values.
     */
    public CloudPcUserProfileSnapshotExportBulkActionResult() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcUserProfileSnapshotExportBulkActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserProfileSnapshotExportBulkActionResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserProfileSnapshotExportBulkActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserProfileSnapshotExportBulkActionResult();
    }
    /**
     * Gets the failedSnapshotIds property value. The failedSnapshotIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedSnapshotIds() {
        return this.backingStore.get("failedSnapshotIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedSnapshotIds", (n) -> { this.setFailedSnapshotIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("failedSnapshotIds", this.getFailedSnapshotIds());
    }
    /**
     * Sets the failedSnapshotIds property value. The failedSnapshotIds property
     * @param value Value to set for the failedSnapshotIds property.
     */
    public void setFailedSnapshotIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("failedSnapshotIds", value);
    }
}
