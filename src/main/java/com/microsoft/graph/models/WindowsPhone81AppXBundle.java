package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81AppXBundle extends WindowsPhone81AppX implements Parsable {
    /** The list of AppX Package Information. */
    private java.util.List<WindowsPackageInformation> _appXPackageInformationList;
    /**
     * Instantiates a new WindowsPhone81AppXBundle and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPhone81AppXBundle() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81AppXBundle");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81AppXBundle
     */
    @javax.annotation.Nonnull
    public static WindowsPhone81AppXBundle createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81AppXBundle();
    }
    /**
     * Gets the appXPackageInformationList property value. The list of AppX Package Information.
     * @return a windowsPackageInformation
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsPackageInformation> getAppXPackageInformationList() {
        return this._appXPackageInformationList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPhone81AppXBundle currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appXPackageInformationList", (n) -> { currentObject.setAppXPackageInformationList(n.getCollectionOfObjectValues(WindowsPackageInformation::createFromDiscriminatorValue)); });
        }};
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
        writer.writeCollectionOfObjectValues("appXPackageInformationList", this.getAppXPackageInformationList());
    }
    /**
     * Sets the appXPackageInformationList property value. The list of AppX Package Information.
     * @param value Value to set for the appXPackageInformationList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppXPackageInformationList(@javax.annotation.Nullable final java.util.List<WindowsPackageInformation> value) {
        this._appXPackageInformationList = value;
    }
}
