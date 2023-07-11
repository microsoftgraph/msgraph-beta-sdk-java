package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS extensions configuration profile.
 */
public class MacOSExtensionsConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * All kernel extensions validly signed by the team identifiers in this list will be allowed to load.
     */
    private java.util.List<String> kernelExtensionAllowedTeamIdentifiers;
    /**
     * If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.
     */
    private Boolean kernelExtensionOverridesAllowed;
    /**
     * A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSKernelExtension> kernelExtensionsAllowed;
    /**
     * Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSSystemExtension> systemExtensionsAllowed;
    /**
     * Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.
     */
    private java.util.List<String> systemExtensionsAllowedTeamIdentifiers;
    /**
     * Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSSystemExtensionTypeMapping> systemExtensionsAllowedTypes;
    /**
     * Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.
     */
    private Boolean systemExtensionsBlockOverride;
    /**
     * Instantiates a new macOSExtensionsConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSExtensionsConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSExtensionsConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSExtensionsConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSExtensionsConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSExtensionsConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("kernelExtensionAllowedTeamIdentifiers", (n) -> { this.setKernelExtensionAllowedTeamIdentifiers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kernelExtensionOverridesAllowed", (n) -> { this.setKernelExtensionOverridesAllowed(n.getBooleanValue()); });
        deserializerMap.put("kernelExtensionsAllowed", (n) -> { this.setKernelExtensionsAllowed(n.getCollectionOfObjectValues(MacOSKernelExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("systemExtensionsAllowed", (n) -> { this.setSystemExtensionsAllowed(n.getCollectionOfObjectValues(MacOSSystemExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("systemExtensionsAllowedTeamIdentifiers", (n) -> { this.setSystemExtensionsAllowedTeamIdentifiers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("systemExtensionsAllowedTypes", (n) -> { this.setSystemExtensionsAllowedTypes(n.getCollectionOfObjectValues(MacOSSystemExtensionTypeMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("systemExtensionsBlockOverride", (n) -> { this.setSystemExtensionsBlockOverride(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kernelExtensionAllowedTeamIdentifiers property value. All kernel extensions validly signed by the team identifiers in this list will be allowed to load.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKernelExtensionAllowedTeamIdentifiers() {
        return this.kernelExtensionAllowedTeamIdentifiers;
    }
    /**
     * Gets the kernelExtensionOverridesAllowed property value. If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKernelExtensionOverridesAllowed() {
        return this.kernelExtensionOverridesAllowed;
    }
    /**
     * Gets the kernelExtensionsAllowed property value. A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.
     * @return a macOSKernelExtension
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSKernelExtension> getKernelExtensionsAllowed() {
        return this.kernelExtensionsAllowed;
    }
    /**
     * Gets the systemExtensionsAllowed property value. Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.
     * @return a macOSSystemExtension
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSystemExtension> getSystemExtensionsAllowed() {
        return this.systemExtensionsAllowed;
    }
    /**
     * Gets the systemExtensionsAllowedTeamIdentifiers property value. Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSystemExtensionsAllowedTeamIdentifiers() {
        return this.systemExtensionsAllowedTeamIdentifiers;
    }
    /**
     * Gets the systemExtensionsAllowedTypes property value. Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.
     * @return a macOSSystemExtensionTypeMapping
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSystemExtensionTypeMapping> getSystemExtensionsAllowedTypes() {
        return this.systemExtensionsAllowedTypes;
    }
    /**
     * Gets the systemExtensionsBlockOverride property value. Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSystemExtensionsBlockOverride() {
        return this.systemExtensionsBlockOverride;
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
        writer.writeCollectionOfPrimitiveValues("kernelExtensionAllowedTeamIdentifiers", this.getKernelExtensionAllowedTeamIdentifiers());
        writer.writeBooleanValue("kernelExtensionOverridesAllowed", this.getKernelExtensionOverridesAllowed());
        writer.writeCollectionOfObjectValues("kernelExtensionsAllowed", this.getKernelExtensionsAllowed());
        writer.writeCollectionOfObjectValues("systemExtensionsAllowed", this.getSystemExtensionsAllowed());
        writer.writeCollectionOfPrimitiveValues("systemExtensionsAllowedTeamIdentifiers", this.getSystemExtensionsAllowedTeamIdentifiers());
        writer.writeCollectionOfObjectValues("systemExtensionsAllowedTypes", this.getSystemExtensionsAllowedTypes());
        writer.writeBooleanValue("systemExtensionsBlockOverride", this.getSystemExtensionsBlockOverride());
    }
    /**
     * Sets the kernelExtensionAllowedTeamIdentifiers property value. All kernel extensions validly signed by the team identifiers in this list will be allowed to load.
     * @param value Value to set for the kernelExtensionAllowedTeamIdentifiers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKernelExtensionAllowedTeamIdentifiers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.kernelExtensionAllowedTeamIdentifiers = value;
    }
    /**
     * Sets the kernelExtensionOverridesAllowed property value. If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.
     * @param value Value to set for the kernelExtensionOverridesAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKernelExtensionOverridesAllowed(@javax.annotation.Nullable final Boolean value) {
        this.kernelExtensionOverridesAllowed = value;
    }
    /**
     * Sets the kernelExtensionsAllowed property value. A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kernelExtensionsAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKernelExtensionsAllowed(@javax.annotation.Nullable final java.util.List<MacOSKernelExtension> value) {
        this.kernelExtensionsAllowed = value;
    }
    /**
     * Sets the systemExtensionsAllowed property value. Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the systemExtensionsAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemExtensionsAllowed(@javax.annotation.Nullable final java.util.List<MacOSSystemExtension> value) {
        this.systemExtensionsAllowed = value;
    }
    /**
     * Sets the systemExtensionsAllowedTeamIdentifiers property value. Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.
     * @param value Value to set for the systemExtensionsAllowedTeamIdentifiers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemExtensionsAllowedTeamIdentifiers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.systemExtensionsAllowedTeamIdentifiers = value;
    }
    /**
     * Sets the systemExtensionsAllowedTypes property value. Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the systemExtensionsAllowedTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemExtensionsAllowedTypes(@javax.annotation.Nullable final java.util.List<MacOSSystemExtensionTypeMapping> value) {
        this.systemExtensionsAllowedTypes = value;
    }
    /**
     * Sets the systemExtensionsBlockOverride property value. Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.
     * @param value Value to set for the systemExtensionsBlockOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemExtensionsBlockOverride(@javax.annotation.Nullable final Boolean value) {
        this.systemExtensionsBlockOverride = value;
    }
}
