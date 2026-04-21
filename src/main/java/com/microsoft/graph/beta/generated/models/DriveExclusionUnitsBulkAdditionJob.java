package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveExclusionUnitsBulkAdditionJob extends ExclusionUnitBulkAdditionJob implements Parsable {
    /**
     * Instantiates a new {@link DriveExclusionUnitsBulkAdditionJob} and sets the default values.
     */
    public DriveExclusionUnitsBulkAdditionJob() {
        super();
        this.setOdataType("#microsoft.graph.driveExclusionUnitsBulkAdditionJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveExclusionUnitsBulkAdditionJob}
     */
    @jakarta.annotation.Nonnull
    public static DriveExclusionUnitsBulkAdditionJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveExclusionUnitsBulkAdditionJob();
    }
    /**
     * Gets the drives property value. The drives property
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
        writer.writeCollectionOfPrimitiveValues("drives", this.getDrives());
    }
    /**
     * Sets the drives property value. The drives property
     * @param value Value to set for the drives property.
     */
    public void setDrives(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("drives", value);
    }
}
