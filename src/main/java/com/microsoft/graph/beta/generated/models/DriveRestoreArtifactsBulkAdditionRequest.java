package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveRestoreArtifactsBulkAdditionRequest extends RestoreArtifactsBulkRequestBase implements Parsable {
    /**
     * Instantiates a new {@link DriveRestoreArtifactsBulkAdditionRequest} and sets the default values.
     */
    public DriveRestoreArtifactsBulkAdditionRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveRestoreArtifactsBulkAdditionRequest}
     */
    @jakarta.annotation.Nonnull
    public static DriveRestoreArtifactsBulkAdditionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveRestoreArtifactsBulkAdditionRequest();
    }
    /**
     * Gets the directoryObjectIds property value. The list of directory object IDs that are added to the corresponding OneDrive for work or school restore session in a bulk operation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDirectoryObjectIds() {
        return this.backingStore.get("directoryObjectIds");
    }
    /**
     * Gets the drives property value. The list of email addresses that are added to the corresponding OneDrive for work or school restore session in a bulk operation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDrives() {
        return this.backingStore.get("drives");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObjectIds", (n) -> { this.setDirectoryObjectIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("directoryObjectIds", this.getDirectoryObjectIds());
        writer.writeCollectionOfPrimitiveValues("drives", this.getDrives());
    }
    /**
     * Sets the directoryObjectIds property value. The list of directory object IDs that are added to the corresponding OneDrive for work or school restore session in a bulk operation.
     * @param value Value to set for the directoryObjectIds property.
     */
    public void setDirectoryObjectIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("directoryObjectIds", value);
    }
    /**
     * Sets the drives property value. The list of email addresses that are added to the corresponding OneDrive for work or school restore session in a bulk operation.
     * @param value Value to set for the drives property.
     */
    public void setDrives(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("drives", value);
    }
}
