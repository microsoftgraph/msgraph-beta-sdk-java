package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Unsupported Group Policy Extension.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnsupportedGroupPolicyExtension extends Entity implements Parsable {
    /**
     * Instantiates a new UnsupportedGroupPolicyExtension and sets the default values.
     */
    public UnsupportedGroupPolicyExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnsupportedGroupPolicyExtension
     */
    @jakarta.annotation.Nonnull
    public static UnsupportedGroupPolicyExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnsupportedGroupPolicyExtension();
    }
    /**
     * Gets the extensionType property value. ExtensionType of the unsupported extension.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExtensionType() {
        return this.backingStore.get("extensionType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("extensionType", (n) -> { this.setExtensionType(n.getStringValue()); });
        deserializerMap.put("namespaceUrl", (n) -> { this.setNamespaceUrl(n.getStringValue()); });
        deserializerMap.put("nodeName", (n) -> { this.setNodeName(n.getStringValue()); });
        deserializerMap.put("settingScope", (n) -> { this.setSettingScope(n.getEnumValue(GroupPolicySettingScope.class)); });
        return deserializerMap;
    }
    /**
     * Gets the namespaceUrl property value. Namespace Url of the unsupported extension.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNamespaceUrl() {
        return this.backingStore.get("namespaceUrl");
    }
    /**
     * Gets the nodeName property value. Node name of the unsupported extension.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNodeName() {
        return this.backingStore.get("nodeName");
    }
    /**
     * Gets the settingScope property value. Scope of the group policy setting.
     * @return a GroupPolicySettingScope
     */
    @jakarta.annotation.Nullable
    public GroupPolicySettingScope getSettingScope() {
        return this.backingStore.get("settingScope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("extensionType", this.getExtensionType());
        writer.writeStringValue("namespaceUrl", this.getNamespaceUrl());
        writer.writeStringValue("nodeName", this.getNodeName());
        writer.writeEnumValue("settingScope", this.getSettingScope());
    }
    /**
     * Sets the extensionType property value. ExtensionType of the unsupported extension.
     * @param value Value to set for the extensionType property.
     */
    public void setExtensionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionType", value);
    }
    /**
     * Sets the namespaceUrl property value. Namespace Url of the unsupported extension.
     * @param value Value to set for the namespaceUrl property.
     */
    public void setNamespaceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("namespaceUrl", value);
    }
    /**
     * Sets the nodeName property value. Node name of the unsupported extension.
     * @param value Value to set for the nodeName property.
     */
    public void setNodeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nodeName", value);
    }
    /**
     * Sets the settingScope property value. Scope of the group policy setting.
     * @param value Value to set for the settingScope property.
     */
    public void setSettingScope(@jakarta.annotation.Nullable final GroupPolicySettingScope value) {
        this.backingStore.set("settingScope", value);
    }
}
