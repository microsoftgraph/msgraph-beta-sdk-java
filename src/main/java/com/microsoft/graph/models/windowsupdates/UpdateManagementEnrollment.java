package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateManagementEnrollment extends UpdatableAssetEnrollment implements Parsable {
    /**
     * Instantiates a new UpdateManagementEnrollment and sets the default values.
     */
    public UpdateManagementEnrollment() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.updateManagementEnrollment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateManagementEnrollment
     */
    @jakarta.annotation.Nonnull
    public static UpdateManagementEnrollment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateManagementEnrollment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(UpdateCategory.class)); });
        return deserializerMap;
    }
    /**
     * Gets the updateCategory property value. The updateCategory property
     * @return a UpdateCategory
     */
    @jakarta.annotation.Nullable
    public UpdateCategory getUpdateCategory() {
        return this.BackingStore.get("updateCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
    }
    /**
     * Sets the updateCategory property value. The updateCategory property
     * @param value Value to set for the updateCategory property.
     */
    public void setUpdateCategory(@jakarta.annotation.Nullable final UpdateCategory value) {
        this.BackingStore.set("updateCategory", value);
    }
}
