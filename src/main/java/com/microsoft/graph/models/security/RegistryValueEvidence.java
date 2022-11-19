package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryValueEvidence extends AlertEvidence implements Parsable {
    /** Registry hive of the key that the recorded action was applied to. */
    private String _registryHive;
    /** Registry key that the recorded action was applied to. */
    private String _registryKey;
    /** Data of the registry value that the recorded action was applied to. */
    private String _registryValue;
    /** Name of the registry value that the recorded action was applied to. */
    private String _registryValueName;
    /** Data type, such as binary or string, of the registry value that the recorded action was applied to. */
    private String _registryValueType;
    /**
     * Instantiates a new RegistryValueEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryValueEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.registryValueEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryValueEvidence
     */
    @javax.annotation.Nonnull
    public static RegistryValueEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryValueEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RegistryValueEvidence currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registryHive", (n) -> { currentObject.setRegistryHive(n.getStringValue()); });
        deserializerMap.put("registryKey", (n) -> { currentObject.setRegistryKey(n.getStringValue()); });
        deserializerMap.put("registryValue", (n) -> { currentObject.setRegistryValue(n.getStringValue()); });
        deserializerMap.put("registryValueName", (n) -> { currentObject.setRegistryValueName(n.getStringValue()); });
        deserializerMap.put("registryValueType", (n) -> { currentObject.setRegistryValueType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryHive() {
        return this._registryHive;
    }
    /**
     * Gets the registryKey property value. Registry key that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryKey() {
        return this._registryKey;
    }
    /**
     * Gets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValue() {
        return this._registryValue;
    }
    /**
     * Gets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueName() {
        return this._registryValueName;
    }
    /**
     * Gets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueType() {
        return this._registryValueType;
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
        writer.writeStringValue("registryHive", this.getRegistryHive());
        writer.writeStringValue("registryKey", this.getRegistryKey());
        writer.writeStringValue("registryValue", this.getRegistryValue());
        writer.writeStringValue("registryValueName", this.getRegistryValueName());
        writer.writeStringValue("registryValueType", this.getRegistryValueType());
    }
    /**
     * Sets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @param value Value to set for the registryHive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryHive(@javax.annotation.Nullable final String value) {
        this._registryHive = value;
    }
    /**
     * Sets the registryKey property value. Registry key that the recorded action was applied to.
     * @param value Value to set for the registryKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryKey(@javax.annotation.Nullable final String value) {
        this._registryKey = value;
    }
    /**
     * Sets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValue(@javax.annotation.Nullable final String value) {
        this._registryValue = value;
    }
    /**
     * Sets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueName(@javax.annotation.Nullable final String value) {
        this._registryValueName = value;
    }
    /**
     * Sets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueType(@javax.annotation.Nullable final String value) {
        this._registryValueType = value;
    }
}
