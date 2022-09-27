package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateManagementEnrollment extends UpdatableAssetEnrollment implements Parsable {
    /** The updateCategory property */
    private UpdateCategory _updateCategory;
    /**
     * Instantiates a new UpdateManagementEnrollment and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static UpdateManagementEnrollment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateManagementEnrollment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateManagementEnrollment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("updateCategory", (n) -> { currentObject.setUpdateCategory(n.getEnumValue(UpdateCategory.class)); });
        }};
    }
    /**
     * Gets the updateCategory property value. The updateCategory property
     * @return a updateCategory
     */
    @javax.annotation.Nullable
    public UpdateCategory getUpdateCategory() {
        return this._updateCategory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
    }
    /**
     * Sets the updateCategory property value. The updateCategory property
     * @param value Value to set for the updateCategory property.
     * @return a void
     */
    public void setUpdateCategory(@javax.annotation.Nullable final UpdateCategory value) {
        this._updateCategory = value;
    }
}
