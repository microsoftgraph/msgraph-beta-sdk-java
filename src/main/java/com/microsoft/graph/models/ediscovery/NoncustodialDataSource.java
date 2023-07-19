package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NoncustodialDataSource extends DataSourceContainer implements Parsable {
    /**
     * Indicates if hold is applied to non-custodial data source (such as mailbox or site).
     */
    private Boolean applyHoldToSource;
    /**
     * User source or SharePoint site data source as non-custodial data source.
     */
    private DataSource dataSource;
    /**
     * Instantiates a new noncustodialDataSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NoncustodialDataSource() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.noncustodialDataSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a noncustodialDataSource
     */
    @javax.annotation.Nonnull
    public static NoncustodialDataSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NoncustodialDataSource();
    }
    /**
     * Gets the applyHoldToSource property value. Indicates if hold is applied to non-custodial data source (such as mailbox or site).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyHoldToSource() {
        return this.applyHoldToSource;
    }
    /**
     * Gets the dataSource property value. User source or SharePoint site data source as non-custodial data source.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public DataSource getDataSource() {
        return this.dataSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applyHoldToSource", (n) -> { this.setApplyHoldToSource(n.getBooleanValue()); });
        deserializerMap.put("dataSource", (n) -> { this.setDataSource(n.getObjectValue(DataSource::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeBooleanValue("applyHoldToSource", this.getApplyHoldToSource());
        writer.writeObjectValue("dataSource", this.getDataSource());
    }
    /**
     * Sets the applyHoldToSource property value. Indicates if hold is applied to non-custodial data source (such as mailbox or site).
     * @param value Value to set for the applyHoldToSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyHoldToSource(@javax.annotation.Nullable final Boolean value) {
        this.applyHoldToSource = value;
    }
    /**
     * Sets the dataSource property value. User source or SharePoint site data source as non-custodial data source.
     * @param value Value to set for the dataSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSource(@javax.annotation.Nullable final DataSource value) {
        this.dataSource = value;
    }
}
