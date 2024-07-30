package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity defines different Windows Operating System products, like 'Windows 11 22H1', 'Windows 11 22H2' etc., along with their available configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceWindowsOperatingSystemImage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedDeviceWindowsOperatingSystemImage} and sets the default values.
     */
    public ManagedDeviceWindowsOperatingSystemImage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedDeviceWindowsOperatingSystemImage}
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceWindowsOperatingSystemImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceWindowsOperatingSystemImage();
    }
    /**
     * Gets the availableUpdates property value. Indicates the available Quality/Security updates for a specific Windows product version (example: Windows 11 22H1), for upto last 3 Patch Tuesdays . This value in the API response would be updated 2-3 days after every Patch Tuesday. Supports: $filter, $select, $top, $skip. Read-only.
     * @return a {@link java.util.List<ManagedDeviceWindowsOperatingSystemUpdate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceWindowsOperatingSystemUpdate> getAvailableUpdates() {
        return this.backingStore.get("availableUpdates");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availableUpdates", (n) -> { this.setAvailableUpdates(n.getCollectionOfObjectValues(ManagedDeviceWindowsOperatingSystemUpdate::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedArchitectures", (n) -> { this.setSupportedArchitectures(n.getCollectionOfEnumValues(ManagedDeviceArchitecture::forValue)); });
        deserializerMap.put("supportedEditions", (n) -> { this.setSupportedEditions(n.getCollectionOfObjectValues(ManagedDeviceWindowsOperatingSystemEdition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the supportedArchitectures property value. Indicates the list of architectures supported by the image. E.g. ['ARM64','X86']. Supports: $filter, $select, $top, $skip. Read-only.
     * @return a {@link java.util.List<ManagedDeviceArchitecture>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceArchitecture> getSupportedArchitectures() {
        return this.backingStore.get("supportedArchitectures");
    }
    /**
     * Gets the supportedEditions property value. Indicates the list of editions supported by the image along with their support dates. Supports: $filter, $select, $top, $skip. Read-only.
     * @return a {@link java.util.List<ManagedDeviceWindowsOperatingSystemEdition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceWindowsOperatingSystemEdition> getSupportedEditions() {
        return this.backingStore.get("supportedEditions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("availableUpdates", this.getAvailableUpdates());
        writer.writeCollectionOfEnumValues("supportedArchitectures", this.getSupportedArchitectures());
        writer.writeCollectionOfObjectValues("supportedEditions", this.getSupportedEditions());
    }
    /**
     * Sets the availableUpdates property value. Indicates the available Quality/Security updates for a specific Windows product version (example: Windows 11 22H1), for upto last 3 Patch Tuesdays . This value in the API response would be updated 2-3 days after every Patch Tuesday. Supports: $filter, $select, $top, $skip. Read-only.
     * @param value Value to set for the availableUpdates property.
     */
    public void setAvailableUpdates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceWindowsOperatingSystemUpdate> value) {
        this.backingStore.set("availableUpdates", value);
    }
    /**
     * Sets the supportedArchitectures property value. Indicates the list of architectures supported by the image. E.g. ['ARM64','X86']. Supports: $filter, $select, $top, $skip. Read-only.
     * @param value Value to set for the supportedArchitectures property.
     */
    public void setSupportedArchitectures(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceArchitecture> value) {
        this.backingStore.set("supportedArchitectures", value);
    }
    /**
     * Sets the supportedEditions property value. Indicates the list of editions supported by the image along with their support dates. Supports: $filter, $select, $top, $skip. Read-only.
     * @param value Value to set for the supportedEditions property.
     */
    public void setSupportedEditions(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceWindowsOperatingSystemEdition> value) {
        this.backingStore.set("supportedEditions", value);
    }
}
