package com.microsoft.graph.admin.windows.updates.updatableassets.enrollassetsbyid;

import com.microsoft.graph.models.windowsupdates.UpdateCategory;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the enrollAssetsById method. */
public class EnrollAssetsByIdPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ids property */
    private java.util.List<String> _ids;
    /** The memberEntityType property */
    private String _memberEntityType;
    /** The updateCategory property */
    private UpdateCategory _updateCategory;
    /**
     * Instantiates a new enrollAssetsByIdPostRequestBody and sets the default values.
     * @return a void
     */
    public EnrollAssetsByIdPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enrollAssetsByIdPostRequestBody
     */
    @javax.annotation.Nonnull
    public static EnrollAssetsByIdPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollAssetsByIdPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EnrollAssetsByIdPostRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("ids", (n) -> { currentObject.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("memberEntityType", (n) -> { currentObject.setMemberEntityType(n.getStringValue()); });
            this.put("updateCategory", (n) -> { currentObject.setUpdateCategory(n.getEnumValue(UpdateCategory.class)); });
        }};
    }
    /**
     * Gets the ids property value. The ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIds() {
        return this._ids;
    }
    /**
     * Gets the memberEntityType property value. The memberEntityType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberEntityType() {
        return this._memberEntityType;
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
        writer.writeCollectionOfPrimitiveValues("ids", this.getIds());
        writer.writeStringValue("memberEntityType", this.getMemberEntityType());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     * @return a void
     */
    public void setIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._ids = value;
    }
    /**
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     * @return a void
     */
    public void setMemberEntityType(@javax.annotation.Nullable final String value) {
        this._memberEntityType = value;
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
