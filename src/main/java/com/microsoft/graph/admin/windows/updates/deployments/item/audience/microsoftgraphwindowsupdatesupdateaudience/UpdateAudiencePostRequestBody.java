package com.microsoft.graph.admin.windows.updates.deployments.item.audience.microsoftgraphwindowsupdatesupdateaudience;

import com.microsoft.graph.models.windowsupdates.UpdatableAsset;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateAudiencePostRequestBody implements AdditionalDataHolder, Parsable {
    /** The addExclusions property */
    private java.util.List<UpdatableAsset> addExclusions;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The addMembers property */
    private java.util.List<UpdatableAsset> addMembers;
    /** The removeExclusions property */
    private java.util.List<UpdatableAsset> removeExclusions;
    /** The removeMembers property */
    private java.util.List<UpdatableAsset> removeMembers;
    /**
     * Instantiates a new updateAudiencePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateAudiencePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAudiencePostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateAudiencePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAudiencePostRequestBody();
    }
    /**
     * Gets the addExclusions property value. The addExclusions property
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getAddExclusions() {
        return this.addExclusions;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the addMembers property value. The addMembers property
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getAddMembers() {
        return this.addMembers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addExclusions", (n) -> { this.setAddExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("addMembers", (n) -> { this.setAddMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("removeExclusions", (n) -> { this.setRemoveExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("removeMembers", (n) -> { this.setRemoveMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the removeExclusions property value. The removeExclusions property
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getRemoveExclusions() {
        return this.removeExclusions;
    }
    /**
     * Gets the removeMembers property value. The removeMembers property
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getRemoveMembers() {
        return this.removeMembers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addExclusions", this.getAddExclusions());
        writer.writeCollectionOfObjectValues("addMembers", this.getAddMembers());
        writer.writeCollectionOfObjectValues("removeExclusions", this.getRemoveExclusions());
        writer.writeCollectionOfObjectValues("removeMembers", this.getRemoveMembers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExclusions property value. The addExclusions property
     * @param value Value to set for the addExclusions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddExclusions(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.addExclusions = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the addMembers property value. The addMembers property
     * @param value Value to set for the addMembers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddMembers(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.addMembers = value;
    }
    /**
     * Sets the removeExclusions property value. The removeExclusions property
     * @param value Value to set for the removeExclusions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveExclusions(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.removeExclusions = value;
    }
    /**
     * Sets the removeMembers property value. The removeMembers property
     * @param value Value to set for the removeMembers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveMembers(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.removeMembers = value;
    }
}
