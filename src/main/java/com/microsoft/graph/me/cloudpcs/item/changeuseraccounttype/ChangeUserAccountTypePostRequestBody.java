package com.microsoft.graph.me.cloudpcs.item.changeuseraccounttype;

import com.microsoft.graph.models.CloudPcUserAccountType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChangeUserAccountTypePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The userAccountType property
     */
    private CloudPcUserAccountType userAccountType;
    /**
     * Instantiates a new changeUserAccountTypePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChangeUserAccountTypePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeUserAccountTypePostRequestBody
     */
    @javax.annotation.Nonnull
    public static ChangeUserAccountTypePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeUserAccountTypePostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(CloudPcUserAccountType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the userAccountType property value. The userAccountType property
     * @return a cloudPcUserAccountType
     */
    @javax.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.userAccountType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the userAccountType property value. The userAccountType property
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccountType(@javax.annotation.Nullable final CloudPcUserAccountType value) {
        this.userAccountType = value;
    }
}
