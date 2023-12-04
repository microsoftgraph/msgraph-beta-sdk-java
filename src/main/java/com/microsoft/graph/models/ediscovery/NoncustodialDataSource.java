package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NoncustodialDataSource extends DataSourceContainer implements Parsable {
    /**
     * Instantiates a new NoncustodialDataSource and sets the default values.
     */
    public NoncustodialDataSource() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.noncustodialDataSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NoncustodialDataSource
     */
    @jakarta.annotation.Nonnull
    public static NoncustodialDataSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NoncustodialDataSource();
    }
    /**
     * Gets the applyHoldToSource property value. Indicates if hold is applied to noncustodial data source (such as mailbox or site).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyHoldToSource() {
        return this.backingStore.get("applyHoldToSource");
    }
    /**
     * Gets the dataSource property value. User source or SharePoint site data source as noncustodial data source.
     * @return a DataSource
     */
    @jakarta.annotation.Nullable
    public DataSource getDataSource() {
        return this.backingStore.get("dataSource");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applyHoldToSource", (n) -> { this.setApplyHoldToSource(n.getBooleanValue()); });
        deserializerMap.put("dataSource", (n) -> { this.setDataSource(n.getObjectValue(DataSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("applyHoldToSource", this.getApplyHoldToSource());
        writer.writeObjectValue("dataSource", this.getDataSource());
    }
    /**
     * Sets the applyHoldToSource property value. Indicates if hold is applied to noncustodial data source (such as mailbox or site).
     * @param value Value to set for the applyHoldToSource property.
     */
    public void setApplyHoldToSource(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applyHoldToSource", value);
    }
    /**
     * Sets the dataSource property value. User source or SharePoint site data source as noncustodial data source.
     * @param value Value to set for the dataSource property.
     */
    public void setDataSource(@jakarta.annotation.Nullable final DataSource value) {
        this.backingStore.set("dataSource", value);
    }
}
