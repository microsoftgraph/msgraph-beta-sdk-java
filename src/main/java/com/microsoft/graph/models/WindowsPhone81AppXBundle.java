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
public class WindowsPhone81AppXBundle extends WindowsPhone81AppX implements Parsable {
    /**
     * The list of AppX Package Information.
     */
    private java.util.List<WindowsPackageInformation> appXPackageInformationList;
    /**
     * Instantiates a new windowsPhone81AppXBundle and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsPhone81AppXBundle() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81AppXBundle");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPhone81AppXBundle
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81AppXBundle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81AppXBundle();
    }
    /**
     * Gets the appXPackageInformationList property value. The list of AppX Package Information.
     * @return a windowsPackageInformation
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsPackageInformation> getAppXPackageInformationList() {
        return this.appXPackageInformationList;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appXPackageInformationList", this.getAppXPackageInformationList());
    }
    /**
     * Sets the appXPackageInformationList property value. The list of AppX Package Information.
     * @param value Value to set for the appXPackageInformationList property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppXPackageInformationList(@jakarta.annotation.Nullable final java.util.List<WindowsPackageInformation> value) {
        this.appXPackageInformationList = value;
    }
}
