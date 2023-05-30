package com.microsoft.graph.admin.windows.updates.updatepolicies.item.audience.exclusions.microsoftgraphwindowsupdatesunenrollassetsbyid;

import com.microsoft.graph.models.windowsupdates.UpdateCategory;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnenrollAssetsByIdPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The ids property */
    private java.util.List<String> ids;
    /** The memberEntityType property */
    private String memberEntityType;
    /** The updateCategory property */
    private UpdateCategory updateCategory;
    /**
     * Instantiates a new unenrollAssetsByIdPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnenrollAssetsByIdPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unenrollAssetsByIdPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UnenrollAssetsByIdPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnenrollAssetsByIdPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("ids", (n) -> { this.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("memberEntityType", (n) -> { this.setMemberEntityType(n.getStringValue()); });
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(UpdateCategory.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ids property value. The ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIds() {
        return this.ids;
    }
    /**
     * Gets the memberEntityType property value. The memberEntityType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberEntityType() {
        return this.memberEntityType;
    }
    /**
     * Gets the updateCategory property value. The updateCategory property
     * @return a updateCategory
     */
    @javax.annotation.Nullable
    public UpdateCategory getUpdateCategory() {
        return this.updateCategory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.ids = value;
    }
    /**
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberEntityType(@javax.annotation.Nullable final String value) {
        this.memberEntityType = value;
    }
    /**
     * Sets the updateCategory property value. The updateCategory property
     * @param value Value to set for the updateCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateCategory(@javax.annotation.Nullable final UpdateCategory value) {
        this.updateCategory = value;
    }
}
