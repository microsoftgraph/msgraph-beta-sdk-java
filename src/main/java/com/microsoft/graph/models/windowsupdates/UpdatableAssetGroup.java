package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdatableAssetGroup extends UpdatableAsset implements Parsable {
    /** Members of the group. Read-only. */
    private java.util.List<UpdatableAsset> _members;
    /**
     * Instantiates a new UpdatableAssetGroup and sets the default values.
     * @return a void
     */
    public UpdatableAssetGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.updatableAssetGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdatableAssetGroup
     */
    @javax.annotation.Nonnull
    public static UpdatableAssetGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatableAssetGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdatableAssetGroup currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the members property value. Members of the group. Read-only.
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getMembers() {
        return this._members;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the members property value. Members of the group. Read-only.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this._members = value;
    }
}
