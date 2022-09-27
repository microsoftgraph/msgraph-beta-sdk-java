package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Unsupported Group Policy Extension. */
public class UnsupportedGroupPolicyExtension extends Entity implements Parsable {
    /** ExtensionType of the unsupported extension. */
    private String _extensionType;
    /** Namespace Url of the unsupported extension. */
    private String _namespaceUrl;
    /** Node name of the unsupported extension. */
    private String _nodeName;
    /** Scope of the group policy setting. */
    private GroupPolicySettingScope _settingScope;
    /**
     * Instantiates a new unsupportedGroupPolicyExtension and sets the default values.
     * @return a void
     */
    public UnsupportedGroupPolicyExtension() {
        super();
        this.setOdataType("#microsoft.graph.unsupportedGroupPolicyExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unsupportedGroupPolicyExtension
     */
    @javax.annotation.Nonnull
    public static UnsupportedGroupPolicyExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnsupportedGroupPolicyExtension();
    }
    /**
     * Gets the extensionType property value. ExtensionType of the unsupported extension.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionType() {
        return this._extensionType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnsupportedGroupPolicyExtension currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("extensionType", (n) -> { currentObject.setExtensionType(n.getStringValue()); });
            this.put("namespaceUrl", (n) -> { currentObject.setNamespaceUrl(n.getStringValue()); });
            this.put("nodeName", (n) -> { currentObject.setNodeName(n.getStringValue()); });
            this.put("settingScope", (n) -> { currentObject.setSettingScope(n.getEnumValue(GroupPolicySettingScope.class)); });
        }};
    }
    /**
     * Gets the namespaceUrl property value. Namespace Url of the unsupported extension.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNamespaceUrl() {
        return this._namespaceUrl;
    }
    /**
     * Gets the nodeName property value. Node name of the unsupported extension.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNodeName() {
        return this._nodeName;
    }
    /**
     * Gets the settingScope property value. Scope of the group policy setting.
     * @return a groupPolicySettingScope
     */
    @javax.annotation.Nullable
    public GroupPolicySettingScope getSettingScope() {
        return this._settingScope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setExtensionType(@javax.annotation.Nullable final String value) {
        this._extensionType = value;
    }
    /**
     * Sets the namespaceUrl property value. Namespace Url of the unsupported extension.
     * @param value Value to set for the namespaceUrl property.
     * @return a void
     */
    public void setNamespaceUrl(@javax.annotation.Nullable final String value) {
        this._namespaceUrl = value;
    }
    /**
     * Sets the nodeName property value. Node name of the unsupported extension.
     * @param value Value to set for the nodeName property.
     * @return a void
     */
    public void setNodeName(@javax.annotation.Nullable final String value) {
        this._nodeName = value;
    }
    /**
     * Sets the settingScope property value. Scope of the group policy setting.
     * @param value Value to set for the settingScope property.
     * @return a void
     */
    public void setSettingScope(@javax.annotation.Nullable final GroupPolicySettingScope value) {
        this._settingScope = value;
    }
}
