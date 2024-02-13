package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An application on the Android Device Owner Managed Home Screen
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerKioskModeApp extends AndroidDeviceOwnerKioskModeFolderItem implements Parsable {
    /**
     * Instantiates a new {@link AndroidDeviceOwnerKioskModeApp} and sets the default values.
     */
    public AndroidDeviceOwnerKioskModeApp() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidDeviceOwnerKioskModeApp}
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeApp();
    }
    /**
     * Gets the className property value. Class name of application
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassName() {
        return this.backingStore.get("className");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("className", (n) -> { this.setClassName(n.getStringValue()); });
        deserializerMap.put("package", (n) -> { this.setPackage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the package property value. Package name of application
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackage() {
        return this.backingStore.get("package");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("className", this.getClassName());
        writer.writeStringValue("package", this.getPackage());
    }
    /**
     * Sets the className property value. Class name of application
     * @param value Value to set for the className property.
     */
    public void setClassName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("className", value);
    }
    /**
     * Sets the package property value. Package name of application
     * @param value Value to set for the package property.
     */
    public void setPackage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("package", value);
    }
}
