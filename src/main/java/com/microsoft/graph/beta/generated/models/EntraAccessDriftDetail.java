package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntraAccessDriftDetail extends AccessDriftDetail implements Parsable {
    /**
     * Instantiates a new {@link EntraAccessDriftDetail} and sets the default values.
     */
    public EntraAccessDriftDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EntraAccessDriftDetail}
     */
    @jakarta.annotation.Nonnull
    public static EntraAccessDriftDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntraAccessDriftDetail();
    }
    /**
     * Gets the accessPackage property value. The accessPackage property
     * @return a {@link DriftAccessPackageInfo}
     */
    @jakarta.annotation.Nullable
    public DriftAccessPackageInfo getAccessPackage() {
        return this.backingStore.get("accessPackage");
    }
    /**
     * Gets the assignedRole property value. The assignedRole property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedRole() {
        return this.backingStore.get("assignedRole");
    }
    /**
     * Gets the expectedRole property value. The expectedRole property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpectedRole() {
        return this.backingStore.get("expectedRole");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(DriftAccessPackageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedRole", (n) -> { this.setAssignedRole(n.getStringValue()); });
        deserializerMap.put("expectedRole", (n) -> { this.setExpectedRole(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the accessPackage property value. The accessPackage property
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final DriftAccessPackageInfo value) {
        this.backingStore.set("accessPackage", value);
    }
    /**
     * Sets the assignedRole property value. The assignedRole property
     * @param value Value to set for the assignedRole property.
     */
    public void setAssignedRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedRole", value);
    }
    /**
     * Sets the expectedRole property value. The expectedRole property
     * @param value Value to set for the expectedRole property.
     */
    public void setExpectedRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("expectedRole", value);
    }
}
