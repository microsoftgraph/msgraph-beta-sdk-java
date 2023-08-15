package com.microsoft.graph.admin.windows.updates.deploymentaudiences.item.members.item.microsoftgraphwindowsupdatesremovemembersbyid;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoveMembersByIdPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ids property
     */
    private java.util.List<String> ids;
    /**
     * The memberEntityType property
     */
    private String memberEntityType;
    /**
     * Instantiates a new removeMembersByIdPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RemoveMembersByIdPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a removeMembersByIdPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RemoveMembersByIdPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoveMembersByIdPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ids", (n) -> { this.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("memberEntityType", (n) -> { this.setMemberEntityType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ids property value. The ids property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIds() {
        return this.ids;
    }
    /**
     * Gets the memberEntityType property value. The memberEntityType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMemberEntityType() {
        return this.memberEntityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ids", this.getIds());
        writer.writeStringValue("memberEntityType", this.getMemberEntityType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ids = value;
    }
    /**
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMemberEntityType(@jakarta.annotation.Nullable final String value) {
        this.memberEntityType = value;
    }
}
