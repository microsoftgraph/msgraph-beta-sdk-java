package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptWithUserDefinedRights extends EncryptContent implements Parsable {
    /**
     * The allowAdHocPermissions property
     */
    private Boolean allowAdHocPermissions;
    /**
     * The allowMailForwarding property
     */
    private Boolean allowMailForwarding;
    /**
     * The decryptionRightsManagementTemplateId property
     */
    private String decryptionRightsManagementTemplateId;
    /**
     * Instantiates a new encryptWithUserDefinedRights and sets the default values.
     */
    public EncryptWithUserDefinedRights() {
        super();
        this.setOdataType("#microsoft.graph.encryptWithUserDefinedRights");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptWithUserDefinedRights
     */
    @jakarta.annotation.Nonnull
    public static EncryptWithUserDefinedRights createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptWithUserDefinedRights();
    }
    /**
     * Gets the allowAdHocPermissions property value. The allowAdHocPermissions property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAdHocPermissions() {
        return this.allowAdHocPermissions;
    }
    /**
     * Gets the allowMailForwarding property value. The allowMailForwarding property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowMailForwarding() {
        return this.allowMailForwarding;
    }
    /**
     * Gets the decryptionRightsManagementTemplateId property value. The decryptionRightsManagementTemplateId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDecryptionRightsManagementTemplateId() {
        return this.decryptionRightsManagementTemplateId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAdHocPermissions", (n) -> { this.setAllowAdHocPermissions(n.getBooleanValue()); });
        deserializerMap.put("allowMailForwarding", (n) -> { this.setAllowMailForwarding(n.getBooleanValue()); });
        deserializerMap.put("decryptionRightsManagementTemplateId", (n) -> { this.setDecryptionRightsManagementTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAdHocPermissions", this.getAllowAdHocPermissions());
        writer.writeBooleanValue("allowMailForwarding", this.getAllowMailForwarding());
        writer.writeStringValue("decryptionRightsManagementTemplateId", this.getDecryptionRightsManagementTemplateId());
    }
    /**
     * Sets the allowAdHocPermissions property value. The allowAdHocPermissions property
     * @param value Value to set for the allowAdHocPermissions property.
     */
    public void setAllowAdHocPermissions(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAdHocPermissions = value;
    }
    /**
     * Sets the allowMailForwarding property value. The allowMailForwarding property
     * @param value Value to set for the allowMailForwarding property.
     */
    public void setAllowMailForwarding(@jakarta.annotation.Nullable final Boolean value) {
        this.allowMailForwarding = value;
    }
    /**
     * Sets the decryptionRightsManagementTemplateId property value. The decryptionRightsManagementTemplateId property
     * @param value Value to set for the decryptionRightsManagementTemplateId property.
     */
    public void setDecryptionRightsManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.decryptionRightsManagementTemplateId = value;
    }
}
