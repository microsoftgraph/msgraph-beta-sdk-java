package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiTenantOrganizationIdentitySyncPolicyTemplate extends Entity implements Parsable {
    /**
     * The templateApplicationLevel property
     */
    private TemplateApplicationLevel templateApplicationLevel;
    /**
     * The userSyncInbound property
     */
    private CrossTenantUserSyncInbound userSyncInbound;
    /**
     * Instantiates a new multiTenantOrganizationIdentitySyncPolicyTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MultiTenantOrganizationIdentitySyncPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationIdentitySyncPolicyTemplate
     */
    @javax.annotation.Nonnull
    public static MultiTenantOrganizationIdentitySyncPolicyTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationIdentitySyncPolicyTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("templateApplicationLevel", (n) -> { this.setTemplateApplicationLevel(n.getEnumValue(TemplateApplicationLevel.class)); });
        deserializerMap.put("userSyncInbound", (n) -> { this.setUserSyncInbound(n.getObjectValue(CrossTenantUserSyncInbound::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the templateApplicationLevel property value. The templateApplicationLevel property
     * @return a templateApplicationLevel
     */
    @javax.annotation.Nullable
    public TemplateApplicationLevel getTemplateApplicationLevel() {
        return this.templateApplicationLevel;
    }
    /**
     * Gets the userSyncInbound property value. The userSyncInbound property
     * @return a crossTenantUserSyncInbound
     */
    @javax.annotation.Nullable
    public CrossTenantUserSyncInbound getUserSyncInbound() {
        return this.userSyncInbound;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("templateApplicationLevel", this.getTemplateApplicationLevel());
        writer.writeObjectValue("userSyncInbound", this.getUserSyncInbound());
    }
    /**
     * Sets the templateApplicationLevel property value. The templateApplicationLevel property
     * @param value Value to set for the templateApplicationLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateApplicationLevel(@javax.annotation.Nullable final TemplateApplicationLevel value) {
        this.templateApplicationLevel = value;
    }
    /**
     * Sets the userSyncInbound property value. The userSyncInbound property
     * @param value Value to set for the userSyncInbound property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSyncInbound(@javax.annotation.Nullable final CrossTenantUserSyncInbound value) {
        this.userSyncInbound = value;
    }
}
