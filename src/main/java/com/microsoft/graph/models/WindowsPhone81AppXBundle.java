package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Phone 8.1 AppX Bundle Line Of Business apps. Inherits from graph.windowsPhone81AppX (which is also to be deprecated at the same time). Will be deprecated in February 2023.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhone81AppXBundle extends WindowsPhone81AppX implements Parsable {
    /**
     * Instantiates a new WindowsPhone81AppXBundle and sets the default values.
     */
    public WindowsPhone81AppXBundle() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81AppXBundle");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81AppXBundle
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81AppXBundle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81AppXBundle();
    }
    /**
     * Gets the appXPackageInformationList property value. The list of AppX Package Information.
     * @return a java.util.List<WindowsPackageInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsPackageInformation> getAppXPackageInformationList() {
        return this.BackingStore.get("appXPackageInformationList");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appXPackageInformationList", (n) -> { this.setAppXPackageInformationList(n.getCollectionOfObjectValues(WindowsPackageInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appXPackageInformationList", this.getAppXPackageInformationList());
    }
    /**
     * Sets the appXPackageInformationList property value. The list of AppX Package Information.
     * @param value Value to set for the appXPackageInformationList property.
     */
    public void setAppXPackageInformationList(@jakarta.annotation.Nullable final java.util.List<WindowsPackageInformation> value) {
        this.BackingStore.set("appXPackageInformationList", value);
    }
}
